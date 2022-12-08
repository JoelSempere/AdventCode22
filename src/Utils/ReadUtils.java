package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadUtils {

    public static String getData(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
        }
        return sb.toString();
    }

    public static List<String> getList(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        List<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        return lines;
    }

    public static List<List<Character>> getCharacterMatrix(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        List<List<Character>> charsList = new ArrayList<>();

        while (sc.hasNextLine()) {
            List<Character> chars = new ArrayList<>();
            for (Character c : sc.nextLine().toCharArray()) {
                chars.add(c);
            }
            charsList.add(chars);
        }
        return charsList;
    }

    public static List<List<Integer>> getNumberMatrix(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);
        List<List<Integer>> numsList = new ArrayList<>();

        while (sc.hasNextLine()) {
            List<Integer> ints = new ArrayList<>();
            for (Character c : sc.nextLine().toCharArray()) {
                ints.add(Integer.parseInt(String.valueOf(c)));
            }
            numsList.add(ints);
        }
        return numsList;
    }
}
