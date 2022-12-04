package day3;

import java.util.ArrayList;
import java.util.List;

public class Compartment {
    private List<Item> items;

    public Compartment(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Compartment{" +
                "items=" + items +
                '}';
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item('B'));
        items.add(new Item('X'));
        items.add(new Item('x'));
        items.add(new Item('z'));
        items.add(new Item('c'));
        Compartment compartment = new Compartment(items);
        System.out.println(compartment.toString());
    }
}
