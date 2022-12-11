package day10;

import Utils.ReadUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static day10.Cycle.printPixel;

public class Day10 {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> lines = ReadUtils.getList(new File("src\\day10\\Input10.txt"));
        List<Cycle> cycles = new ArrayList<>();
        int valueX = 1;
        int position = 1;
        for (String line : lines) {
            cycles.add(new Cycle( position, valueX));
            if (Objects.equals(line.split(" ")[0], "addx")){
                position ++;
                cycles.add(new Cycle(position, valueX));
                int number = Integer.parseInt(line.split(" ")[1]);
                valueX += number;
            }
            position++;
        }

        List<Cycle> selectedCycles = new ArrayList<>();
        int sum = 0;
        System.out.println("P2: ");
        for (Cycle c : cycles) {
            System.out.print(printPixel(c.getPosition(), c.getValueX()));
            if ((c.getPosition() + 20) % 40 == 0 ) {
                selectedCycles.add(c);
            }
        }

        for (Cycle selectedCycle : selectedCycles) {
            sum += selectedCycle.getSignalStrength();
        }
        System.out.println(" \n");
        System.out.println("P1:\n\n" + sum);

    }


}
