package day11;

public class Item {
    private int worryLevel;
    private int timesWorried;

    public Item(int name) {
        this.worryLevel = name;
        this.timesWorried = 0;
    }

    public int getWorryLevel() {
        return worryLevel;
    }

    public void setWorryLevel(int worryLevel) {
        this.worryLevel = worryLevel;
    }

    public int getTimesWorried() {
        return timesWorried;
    }

    public void setTimesWorried(int timesWorried) {
        this.timesWorried = timesWorried;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name=" + worryLevel +
                ", timesWorried=" + timesWorried +
                '}';
    }
}
