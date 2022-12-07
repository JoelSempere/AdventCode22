package day7;

import Utils.ReadUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Day7 {
    public static int resultP1;
    public static final int TOTAL_SPACE = 70000000;
    public static final int UPDATE = 30000000;

    private static Dir getChildDir(Dir actual, String name) {
        Dir dir = null;
        for (Dir child : actual.getChDirs()) {
            if (Objects.equals(child.getName(), name)) {
                dir = child;
            }
        }
        return dir;
    }

    private static void iterateDirs(Dir d) {
        for (Dir dir : d.getChDirs()) {
            if(dir.getParent() != null && dir.getSize() < 100000) {
                resultP1 += dir.getSize();
                //System.out.println(dir.getName() + " - " + dir.getSize());
            }
            if (dir.getChDirs().size() > 0) {
                iterateDirs(dir);
            }
            System.out.println(dir.getName() + " - " + dir.getSize());
        }

    }

    private static List<Dir> dirsToDelete(Dir root) {
        List<Dir> dirs = new ArrayList<>();
        int sizeRequired = Day7.UPDATE - (TOTAL_SPACE - root.getSize());
        fillDirsToDelete(root, sizeRequired, dirs);
        return dirs;
    }

    private static void fillDirsToDelete(Dir root, int sizeRequired, List<Dir> dirs) {
        for (Dir d : root.getChDirs()) {
            if (d.getSize() >= sizeRequired) {
                dirs.add(d);
            }
            if (d.getChDirs().size() > 0) {
                fillDirsToDelete(d, sizeRequired, dirs);
            }
        }
    }

    private static Dir getTheSmallestDir(Dir root) {
        List<Dir> dirs = dirsToDelete(root);
        Dir smallest = dirs.get(0);
        for(Dir d : dirs ) {
            if(d.getSize() < smallest.getSize()) {
                smallest = d;
            }
        }
        return smallest;
    }


    public static void main(String[] args) throws FileNotFoundException {

        Dir root = new Dir();
        Dir actual = root;
        List<String> commands = ReadUtils.getList(new File("src\\day7\\day7.txt"));

        for (String command : commands) {
            List<String> params = List.of(command.split(" "));
            if(Objects.equals(params.get(1), "cd")) {
                if(Objects.equals(params.get(2), "/")) {
                    actual = root;
                }
                else if(Objects.equals(params.get(2), "..")) {
                    actual = actual.getParent();
                }
                else {
                    actual = getChildDir(actual, params.get(2));
                }
            }
            else if (Objects.equals(params.get(0), "dir")) {
                actual.addDir(new Dir(actual, params.get(1)));
            }
            else if ( Pattern.compile("-?\\d+(\\.\\d+)?").matcher(params.get(0)).matches() ){
                actual.addDoc(new Doc(actual, params.get(1), Integer.parseInt(params.get(0))));
            }
        }

        System.out.println(root.getSize());
        iterateDirs(root);
        System.out.println("-----P1-----");
        System.out.println(resultP1);
        System.out.println("-----P2-----");
        System.out.println(getTheSmallestDir(root).getSize());

    }




}
