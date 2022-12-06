package day6;
import Utils.ReadUtils;
import day6.UtilsD6.*;

import java.io.File;
import java.io.FileNotFoundException;

public class Day6 {
    public static void main(String[] args) throws FileNotFoundException {
        String data = ReadUtils.getData(new File("src\\day6\\input6.txt"));
        System.out.println(UtilsD6.getFirstStartOfPacket(data, 4));
        System.out.println(UtilsD6.getFirstStartOfPacket(data, 14));
    }
}
