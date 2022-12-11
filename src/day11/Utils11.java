package day11;

import Utils.ReadUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Utils11 {

    private static List<List<String>> getMonkeyInfo(List<String> list) {
        List<List<String>> group = new ArrayList<>();
        List<String> monkeyInfo = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).startsWith("Monkey") && i != 0) {
                group.add(monkeyInfo);
                monkeyInfo = new ArrayList<>();
                //System.out.println(list.get(i));
            }
            else if (!list.get(i).isEmpty() && !list.get(i).startsWith("Monkey")) {
                monkeyInfo.add(list.get(i));
                //System.out.println(list.get(i));
            }

        }
        group.add(monkeyInfo);
        return group;
    }

    private static Deque<Item> getLineItems(String items) {
        Deque<Item> monkeyItems = new ArrayDeque<>();
        for (String item : items.split(",")) {
            monkeyItems.add(new Item(Integer.parseInt(item.trim())));
        }
        return monkeyItems;
    }

    public static List<Monkey> createMonkeys() throws FileNotFoundException {
        List<List<String>> monkeyInfo = getMonkeyInfo(ReadUtils.getList(new File("src\\day11\\Input11.txt")));
        List<Monkey> monkeys = new ArrayList<>();
        for (List<String> info : monkeyInfo) {
            Monkey monkey = new Monkey();
            for (int i = 0; i < info.size(); i++) {
                switch (i) {
                    case 0 -> monkey.setItems(getLineItems(info.get(i).split(":")[1]));
                    case 1 -> monkey.setOperation(info.get(i).split(":")[1].split("=")[1]);
                    case 2 -> monkey.setDivisibleBy(Integer.parseInt(info.get(i).split(":")[1].split(" ")[3]));
                    case 3 -> monkey.setMonkeyTrue(Integer.parseInt(info.get(i).split(":")[1].split(" ")[4]));
                    case 4 -> monkey.setMonkeyFalse(Integer.parseInt(info.get(i).split(":")[1].split(" ")[4]));
                }
            }
            monkeys.add(monkey);
        }
        return monkeys;
    }

    public static void main(String[] args) throws FileNotFoundException {
        /*for (Monkey monkey : Objects.requireNonNull(createMonkeys())) {
            System.out.println(monkey);
        }*/
    }
}
