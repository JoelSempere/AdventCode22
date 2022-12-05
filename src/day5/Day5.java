package day5;

import java.util.Deque;
import java.util.List;

import static day5.Utils.*;

public class Day5 {
    public static void main(String[] args) {
        //P1
        List<Deque<String>> stacks = getLines();
        for (List<Integer> moves : Utils.commands().values()) {
            executeMovement(moves, stacks);
        }
        for (Deque<String> stack : stacks) {
            if (stack.size() > 0) {
                System.out.print(stack.getFirst());
            }
        }
        System.out.println(" ");

        //P2
        List<Deque<String>> stacks2 = getLines();
        for (List<Integer> moves : Utils.commands().values()) {
            executeMovement2(moves, stacks2);
        }
        for (Deque<String> stack : stacks2) {
            if (stack.size() > 0) {
                System.out.print(stack.getFirst());
            }
        }

    }
}
