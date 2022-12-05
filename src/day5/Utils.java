package day5;

import java.util.*;

public class Utils {
    public static List<Deque<String>> getLines() {
        List<Deque<String>> output = new ArrayList<>();

        String text = """
                                [M]     [W] [M]   \s
                            [L] [Q] [S] [C] [R]   \s
                            [Q] [F] [F] [T] [N] [S]
                    [N]     [V] [V] [H] [L] [J] [D]
                    [D] [D] [W] [P] [G] [R] [D] [F]
                [T] [T] [M] [G] [G] [Q] [N] [W] [L]
                [Z] [H] [F] [J] [D] [Z] [S] [H] [Q]
                [B] [V] [B] [T] [W] [V] [Z] [Z] [M]
                 1   2   3   4   5   6   7   8   9\s""";
        Integer stackSize = List.of(text.split("\\R")).get(List.of(text.split("\\R")).size() - 1).split("(?<=\\G.{4})").length;
        for (int i = 0; i < stackSize; i++) {
            output.add(new ArrayDeque<>());
        }
        List<String> lines = List.of(text.split("\\R"));
        for (int i = 0; i < lines.size() - 1; i++) {
            //System.out.println(lines.get(i));
            List<String> items = Arrays.asList(lines.get(i).split("(?<=\\G.{4})"));
            //System.out.println(items);
            for (int j = 0; j < stackSize; j++) {
                if(items.get(j).trim().length() > 0) {
                    output.get(j).add(items.get(j));
                }
            }
        }
        //System.out.println(output);
        return output;
    }

    public static Map<Integer, List<Integer>> commands() {
        List<String> lines = List.of(getData().split("\\R"));
        Map<Integer, List<Integer>> outputMap = new HashMap<>();
        for (int i = 0; i < lines.size() ; i++) {
            if(!outputMap.containsKey(i)) {
                outputMap.put(i, new ArrayList<>());
            }
            outputMap.get(i).add(Integer.parseInt(lines.get(i).split(" ")[1]));
            outputMap.get(i).add(Integer.parseInt(lines.get(i).split(" ")[3]));
            outputMap.get(i).add(Integer.parseInt(lines.get(i).split(" ")[5]));
        }
        return outputMap;
    }

    public static void executeMovement(List<Integer> moves, List<Deque<String>> stacks) {
        Integer repeat = moves.get(0) ;
        Integer from = moves.get(1) - 1;
        Integer to = moves.get(2) - 1;
        for (int i = 0; i < repeat; i++) {
            String f = stacks.get(from).pollFirst();
            stacks.get(to).addFirst(f);
        }
    }

    public static void executeMovement2(List<Integer> moves, List<Deque<String>> stacks) {
        Integer repeat = moves.get(0) ;
        Integer from = moves.get(1) - 1;
        Integer to = moves.get(2) - 1;
        List<String> items = new ArrayList<>();
        for (int i = 0; i < repeat; i++) {
            items.add(stacks.get(from).pollFirst());
        }
        for (int i = repeat; i > 0; i--) {
            stacks.get(to).addFirst(items.get(i - 1));
        }
    }

    private static String getData() {
        return """
                move 1 from 7 to 4
                move 1 from 6 to 2
                move 5 from 9 to 4
                move 2 from 2 to 8
                move 2 from 2 to 6
                move 3 from 3 to 7
                move 3 from 7 to 1
                move 1 from 9 to 4
                move 4 from 7 to 3
                move 5 from 1 to 8
                move 1 from 1 to 2
                move 1 from 4 to 9
                move 4 from 5 to 6
                move 1 from 5 to 8
                move 3 from 2 to 4
                move 3 from 6 to 4
                move 3 from 5 to 9
                move 1 from 9 to 7
                move 1 from 9 to 8
                move 2 from 7 to 9
                move 1 from 7 to 9
                move 1 from 7 to 8
                move 2 from 9 to 8
                move 13 from 4 to 2
                move 2 from 6 to 1
                move 3 from 3 to 2
                move 9 from 2 to 7
                move 1 from 9 to 7
                move 5 from 7 to 8
                move 9 from 8 to 4
                move 2 from 7 to 1
                move 1 from 1 to 7
                move 2 from 3 to 2
                move 14 from 4 to 5
                move 3 from 8 to 4
                move 13 from 8 to 3
                move 2 from 7 to 1
                move 6 from 6 to 5
                move 1 from 6 to 9
                move 3 from 2 to 8
                move 1 from 7 to 8
                move 5 from 2 to 8
                move 4 from 4 to 8
                move 1 from 9 to 8
                move 1 from 7 to 1
                move 1 from 1 to 2
                move 7 from 3 to 2
                move 4 from 3 to 2
                move 2 from 5 to 3
                move 2 from 1 to 5
                move 5 from 8 to 7
                move 6 from 8 to 3
                move 11 from 5 to 8
                move 8 from 8 to 9
                move 5 from 7 to 8
                move 3 from 1 to 8
                move 5 from 3 to 8
                move 11 from 2 to 9
                move 1 from 3 to 5
                move 1 from 2 to 1
                move 1 from 2 to 7
                move 6 from 5 to 7
                move 19 from 9 to 7
                move 3 from 5 to 3
                move 1 from 5 to 4
                move 1 from 1 to 4
                move 1 from 9 to 8
                move 25 from 7 to 9
                move 2 from 4 to 1
                move 2 from 1 to 4
                move 2 from 4 to 7
                move 2 from 7 to 9
                move 5 from 3 to 1
                move 1 from 7 to 1
                move 9 from 9 to 5
                move 3 from 5 to 6
                move 9 from 9 to 1
                move 7 from 1 to 3
                move 6 from 8 to 9
                move 1 from 5 to 2
                move 10 from 9 to 2
                move 1 from 2 to 7
                move 5 from 9 to 8
                move 1 from 5 to 8
                move 5 from 3 to 8
                move 1 from 9 to 4
                move 4 from 3 to 6
                move 4 from 6 to 3
                move 3 from 1 to 4
                move 3 from 2 to 4
                move 3 from 5 to 8
                move 3 from 4 to 9
                move 1 from 7 to 3
                move 2 from 9 to 8
                move 4 from 2 to 5
                move 1 from 3 to 4
                move 1 from 9 to 3
                move 5 from 5 to 6
                move 7 from 8 to 5
                move 3 from 1 to 7
                move 6 from 5 to 8
                move 5 from 4 to 5
                move 3 from 3 to 2
                move 1 from 1 to 4
                move 19 from 8 to 1
                move 3 from 7 to 3
                move 4 from 2 to 9
                move 1 from 2 to 6
                move 7 from 6 to 4
                move 1 from 6 to 2
                move 2 from 1 to 3
                move 5 from 4 to 1
                move 1 from 6 to 2
                move 3 from 3 to 6
                move 12 from 1 to 2
                move 2 from 8 to 1
                move 14 from 2 to 4
                move 7 from 1 to 5
                move 10 from 4 to 6
                move 3 from 6 to 4
                move 1 from 8 to 4
                move 4 from 3 to 5
                move 1 from 2 to 3
                move 2 from 1 to 4
                move 17 from 5 to 3
                move 7 from 4 to 1
                move 1 from 9 to 4
                move 4 from 6 to 3
                move 5 from 4 to 8
                move 12 from 3 to 1
                move 6 from 3 to 5
                move 17 from 1 to 5
                move 2 from 1 to 9
                move 3 from 1 to 4
                move 7 from 8 to 2
                move 4 from 3 to 7
                move 1 from 1 to 8
                move 17 from 5 to 2
                move 11 from 2 to 8
                move 11 from 8 to 4
                move 11 from 2 to 4
                move 4 from 6 to 1
                move 4 from 1 to 3
                move 2 from 6 to 9
                move 3 from 7 to 8
                move 3 from 5 to 3
                move 23 from 4 to 3
                move 4 from 4 to 8
                move 1 from 7 to 4
                move 2 from 2 to 3
                move 6 from 3 to 2
                move 16 from 3 to 9
                move 2 from 5 to 8
                move 1 from 4 to 5
                move 2 from 5 to 9
                move 1 from 2 to 3
                move 1 from 3 to 8
                move 9 from 9 to 1
                move 6 from 3 to 8
                move 3 from 3 to 1
                move 18 from 8 to 9
                move 1 from 3 to 5
                move 5 from 1 to 4
                move 5 from 1 to 8
                move 3 from 4 to 1
                move 1 from 5 to 2
                move 2 from 4 to 8
                move 1 from 1 to 2
                move 5 from 2 to 7
                move 2 from 8 to 1
                move 2 from 2 to 6
                move 3 from 1 to 6
                move 3 from 9 to 6
                move 31 from 9 to 7
                move 26 from 7 to 8
                move 3 from 1 to 6
                move 22 from 8 to 4
                move 2 from 4 to 5
                move 4 from 6 to 5
                move 11 from 4 to 3
                move 9 from 4 to 6
                move 2 from 5 to 9
                move 4 from 7 to 1
                move 2 from 6 to 1
                move 1 from 5 to 3
                move 6 from 8 to 6
                move 8 from 6 to 2
                move 1 from 1 to 6
                move 3 from 1 to 3
                move 1 from 5 to 3
                move 1 from 5 to 9
                move 5 from 7 to 2
                move 2 from 9 to 6
                move 4 from 8 to 6
                move 1 from 7 to 2
                move 1 from 5 to 4
                move 12 from 3 to 4
                move 3 from 3 to 1
                move 3 from 6 to 8
                move 1 from 9 to 3
                move 6 from 2 to 6
                move 2 from 3 to 2
                move 10 from 2 to 7
                move 2 from 1 to 9
                move 2 from 1 to 6
                move 1 from 1 to 4
                move 9 from 7 to 9
                move 3 from 8 to 7
                move 7 from 4 to 8
                move 2 from 7 to 4
                move 4 from 8 to 1
                move 5 from 8 to 2
                move 3 from 1 to 3
                move 1 from 8 to 7
                move 3 from 3 to 7
                move 4 from 2 to 6
                move 8 from 4 to 2
                move 5 from 2 to 5
                move 11 from 9 to 7
                move 2 from 5 to 7
                move 16 from 7 to 8
                move 5 from 8 to 7
                move 1 from 4 to 3
                move 3 from 5 to 1
                move 11 from 6 to 5
                move 7 from 5 to 4
                move 5 from 7 to 4
                move 1 from 3 to 7
                move 2 from 5 to 4
                move 10 from 4 to 8
                move 14 from 6 to 3
                move 1 from 5 to 9
                move 1 from 6 to 5
                move 2 from 2 to 9
                move 2 from 1 to 3
                move 2 from 5 to 3
                move 2 from 7 to 6
                move 2 from 1 to 4
                move 1 from 2 to 3
                move 19 from 3 to 6
                move 3 from 9 to 2
                move 4 from 2 to 6
                move 6 from 6 to 7
                move 13 from 6 to 2
                move 14 from 8 to 1
                move 6 from 4 to 3
                move 5 from 7 to 8
                move 3 from 6 to 3
                move 2 from 8 to 2
                move 2 from 6 to 8
                move 4 from 1 to 8
                move 13 from 8 to 4
                move 10 from 4 to 7
                move 1 from 4 to 5
                move 1 from 5 to 1
                move 3 from 6 to 5
                move 3 from 8 to 9
                move 9 from 3 to 1
                move 3 from 5 to 8
                move 3 from 9 to 6
                move 3 from 8 to 7
                move 1 from 6 to 9
                move 1 from 9 to 4
                move 9 from 2 to 8
                move 2 from 2 to 6
                move 14 from 7 to 1
                move 31 from 1 to 5
                move 3 from 1 to 7
                move 4 from 6 to 8
                move 24 from 5 to 3
                move 2 from 8 to 1
                move 1 from 8 to 5
                move 2 from 1 to 7
                move 3 from 7 to 6
                move 6 from 8 to 6
                move 2 from 4 to 2
                move 1 from 4 to 3
                move 2 from 2 to 7
                move 6 from 6 to 7
                move 4 from 8 to 6
                move 7 from 6 to 2
                move 12 from 7 to 5
                move 4 from 2 to 8
                move 1 from 2 to 4
                move 1 from 4 to 6
                move 1 from 6 to 7
                move 1 from 7 to 3
                move 3 from 3 to 8
                move 17 from 3 to 5
                move 4 from 3 to 6
                move 35 from 5 to 3
                move 2 from 2 to 6
                move 1 from 5 to 9
                move 9 from 3 to 7
                move 6 from 8 to 1
                move 4 from 2 to 6
                move 4 from 6 to 9
                move 20 from 3 to 9
                move 22 from 9 to 7
                move 1 from 8 to 6
                move 29 from 7 to 5
                move 4 from 6 to 8
                move 6 from 1 to 8
                move 2 from 7 to 3
                move 1 from 6 to 5
                move 2 from 3 to 9
                move 1 from 9 to 3
                move 4 from 5 to 6
                move 18 from 5 to 1
                move 7 from 3 to 1
                move 1 from 3 to 6
                move 3 from 5 to 1
                move 1 from 3 to 9
                move 4 from 5 to 2
                move 10 from 8 to 7
                move 2 from 9 to 3
                move 1 from 3 to 5
                move 21 from 1 to 9
                move 1 from 3 to 2
                move 1 from 2 to 9
                move 15 from 9 to 3
                move 4 from 7 to 1
                move 2 from 6 to 1
                move 7 from 9 to 1
                move 1 from 5 to 4
                move 1 from 4 to 6
                move 6 from 3 to 9
                move 3 from 6 to 5
                move 19 from 1 to 6
                move 8 from 3 to 6
                move 1 from 3 to 7
                move 20 from 6 to 7
                move 1 from 2 to 6
                move 6 from 9 to 8
                move 2 from 9 to 4
                move 1 from 1 to 3
                move 1 from 2 to 9
                move 3 from 5 to 6
                move 2 from 7 to 3
                move 2 from 9 to 7
                move 1 from 4 to 8
                move 4 from 8 to 9
                move 4 from 7 to 1
                move 2 from 1 to 7
                move 1 from 3 to 2
                move 2 from 8 to 9
                move 6 from 6 to 2
                move 1 from 8 to 1
                move 1 from 5 to 7
                move 4 from 2 to 9
                move 1 from 3 to 5
                move 5 from 6 to 1
                move 1 from 4 to 2
                move 1 from 9 to 6
                move 1 from 9 to 6
                move 4 from 6 to 3
                move 7 from 9 to 7
                move 8 from 7 to 2
                move 1 from 5 to 8
                move 5 from 2 to 9
                move 3 from 2 to 5
                move 6 from 1 to 3
                move 17 from 7 to 6
                move 1 from 8 to 2
                move 2 from 1 to 7
                move 5 from 9 to 4
                move 4 from 3 to 8
                move 3 from 4 to 1
                move 1 from 9 to 2
                move 4 from 2 to 1
                move 1 from 8 to 4
                move 1 from 5 to 9
                move 1 from 2 to 3
                move 3 from 3 to 2
                move 10 from 7 to 6
                move 3 from 4 to 1
                move 5 from 3 to 2
                move 4 from 1 to 5
                move 3 from 8 to 6
                move 12 from 6 to 4
                move 1 from 9 to 3
                move 1 from 5 to 2
                move 3 from 1 to 6
                move 12 from 6 to 8
                move 3 from 1 to 5
                move 2 from 4 to 3
                move 5 from 8 to 7
                move 7 from 5 to 3
                move 3 from 7 to 9
                move 1 from 5 to 8
                move 5 from 3 to 7
                move 10 from 6 to 5
                move 2 from 7 to 5
                move 8 from 2 to 9
                move 5 from 3 to 9
                move 9 from 5 to 1
                move 5 from 7 to 4
                move 15 from 9 to 5
                move 1 from 2 to 5
                move 1 from 8 to 5
                move 6 from 4 to 1
                move 2 from 2 to 9
                move 18 from 5 to 8
                move 18 from 8 to 3
                move 16 from 3 to 4
                move 3 from 5 to 8
                move 1 from 9 to 2
                move 3 from 1 to 7
                move 3 from 8 to 2
                move 3 from 7 to 9
                move 2 from 3 to 4
                move 3 from 9 to 8
                move 11 from 1 to 6
                move 2 from 9 to 4
                move 3 from 6 to 9
                move 8 from 6 to 4
                move 26 from 4 to 7
                move 1 from 2 to 5
                move 1 from 5 to 2
                move 3 from 9 to 3
                move 21 from 7 to 6
                move 4 from 2 to 4
                move 1 from 2 to 3
                move 5 from 7 to 6
                move 8 from 8 to 1
                move 1 from 3 to 7
                move 9 from 1 to 4
                move 1 from 7 to 4
                move 20 from 4 to 7
                move 1 from 8 to 5
                move 2 from 4 to 8
                move 1 from 4 to 9
                move 3 from 8 to 9
                move 1 from 5 to 8
                move 2 from 3 to 1
                move 4 from 7 to 8
                move 3 from 7 to 5
                move 1 from 1 to 7
                move 4 from 8 to 3
                move 3 from 5 to 6
                move 1 from 8 to 4
                move 1 from 1 to 8
                move 28 from 6 to 4
                move 1 from 6 to 1
                move 2 from 7 to 8
                move 1 from 8 to 7
                move 1 from 8 to 1
                move 2 from 1 to 9
                move 3 from 9 to 3
                move 12 from 7 to 5
                move 7 from 3 to 1
                move 1 from 3 to 6
                move 26 from 4 to 9
                move 1 from 6 to 3
                move 1 from 3 to 6
                move 1 from 8 to 6
                move 1 from 7 to 8
                move 1 from 6 to 3
                move 3 from 1 to 3
                move 5 from 4 to 3
                move 28 from 9 to 4
                move 2 from 1 to 5
                move 22 from 4 to 1
                move 3 from 5 to 3
                move 5 from 5 to 7
                move 10 from 1 to 6
                move 1 from 5 to 2
                move 3 from 5 to 3
                move 2 from 5 to 9
                move 3 from 9 to 7
                move 2 from 4 to 5
                move 1 from 5 to 4
                move 4 from 3 to 8
                move 1 from 5 to 7
                move 9 from 6 to 5
                move 1 from 7 to 6
                move 1 from 6 to 5
                move 2 from 6 to 9
                move 3 from 5 to 1
                move 13 from 1 to 3
                move 7 from 7 to 5
                move 1 from 2 to 9
                move 3 from 8 to 2
                move 1 from 7 to 2
                move 3 from 4 to 3
                move 19 from 3 to 8
                move 5 from 3 to 7
                move 1 from 7 to 1
                move 19 from 8 to 6
                move 5 from 1 to 4
                move 5 from 5 to 2
                move 2 from 2 to 7
                move 3 from 4 to 1
                move 6 from 5 to 7
                move 2 from 8 to 7
                move 2 from 2 to 7
                move 3 from 3 to 5
                move 5 from 7 to 6
                move 6 from 6 to 1
                move 2 from 5 to 1
                move 2 from 4 to 3
                move 1 from 5 to 8""";
    }
}
