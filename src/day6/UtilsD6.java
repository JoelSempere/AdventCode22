package day6;

import java.util.Arrays;
import java.util.Objects;

public class UtilsD6 {
    public static Integer getFirstStartOfPacket(String data, int end) {
        int start = 0;
        boolean startOfPacket = false;
        int result = 0;

        while(!startOfPacket) {
            char[] chars = data.substring(start,end - 1).toCharArray();
            char toCompare = data.toCharArray()[end - 1];
            if(checkIfContains(chars, toCompare)) {
                start ++;
                end ++;
            }
            else {
                result = end;
                startOfPacket = true;
            }
        }
        return result;
    }

   private static boolean checkIfContains(char[] chars, char toCompare) {
        char[] allChars = Arrays.copyOf(chars, chars.length + 1);
        allChars[allChars.length - 1] = toCompare;
        boolean result = false;
        for (int i = 0; i < allChars.length; i++) {
           for (int j = i + 1; j < allChars.length; j++) {
               if (allChars[j] == allChars[i]) {
                   result = true;
                   break;
               }

           }
        }
        return result;
    }
}
