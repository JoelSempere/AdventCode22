package day11;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static day11.Utils11.createMonkeys;

public class Day11 {
    private static final int ROUNDS = 20;
    public static void main(String[] args) throws FileNotFoundException {
        List<Monkey> monkeys = createMonkeys();
        for (int i = 0; i < ROUNDS; i++) {
            for (int j = 0; j < monkeys.size(); j++) {
                monkeys.get(j).play(monkeys);
                System.out.println("Monkey " + j + " inpected items " + monkeys.get(j).getInspectTimes());
            }

        }

        monkeys.sort(Comparator.comparing(Monkey::getInspectTimes).reversed());

        System.out.println(monkeys.get(0).getInspectTimes() * monkeys.get(1).getInspectTimes());
    }

}
