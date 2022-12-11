package day11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Monkey {
    private Deque<Item> items;
    private String operation; //based in my worry level // calculo seguido de / 3
    private int divisibleBy; //true - monkey + 1, false - monkey - 1; 1st monkey - + 1, + 2; last monkey - 0, + 1;
    private int monkeyTrue;
    private int monkeyFalse;
    private int inspectTimes;

    public Monkey() {
        this.items = new ArrayDeque<>();
        inspectTimes = 0;
    }

    public void play(List<Monkey> monkeys) {
        for (Item item : this.items) {
            this.inspectTimes ++;
            worryLevelCalculation(item);
            if(item.getWorryLevel() % this.divisibleBy == 0) {
                monkeys.get(monkeyTrue).getItems().add(this.items.pollFirst());
            }
            else {
                monkeys.get(monkeyFalse).getItems().add(this.items.pollFirst());
            }
        }

    }

    private void worryLevelCalculation(Item item) {
        int number = Pattern.compile("-?\\d+(\\.\\d+)?").matcher(this.operation.split(" ")[3]).matches() ?
                Integer.parseInt(this.operation.split(" ")[3]) : item.getWorryLevel();
        int worryLevel;
        if(Objects.equals(this.operation.split(" ")[2], "*")){
            worryLevel = (item.getWorryLevel() * number) / 3;
        }
        else {
            worryLevel = (item.getWorryLevel() + number) / 3;
        }
        item.setWorryLevel((int)(Math.floor(worryLevel)));
        item.setTimesWorried(item.getTimesWorried() + 1);
    }

    public Deque<Item> getItems() {
        return items;
    }

    public void setItems(Deque<Item> items) {
        this.items = items;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getDivisibleBy() {
        return divisibleBy;
    }

    public void setDivisibleBy(int divisibleBy) {
        this.divisibleBy = divisibleBy;
    }

    public int getMonkeyTrue() {
        return monkeyTrue;
    }

    public void setMonkeyTrue(int monkeyTrue) {
        this.monkeyTrue = monkeyTrue;
    }

    public int getMonkeyFalse() {
        return monkeyFalse;
    }

    public void setMonkeyFalse(int monkeyFalse) {
        this.monkeyFalse = monkeyFalse;
    }

    public int getInspectTimes() {
        return inspectTimes;
    }

    public void setInspectTimes(int inspectTimes) {
        this.inspectTimes = inspectTimes;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "items=" + items +
                ", operation='" + operation + '\'' +
                ", divisibleBy=" + divisibleBy +
                ", monkeyTrue=" + monkeyTrue +
                ", monkeyFalse=" + monkeyFalse +
                ", inspectTimes=" + inspectTimes +
                '}';
    }
}
