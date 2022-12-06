package Utils;

import java.io.File;
import java.io.FileNotFoundException;
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
}
