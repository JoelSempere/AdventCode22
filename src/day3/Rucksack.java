package day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rucksack {
    private Compartment compartment1;
    private Compartment compartment2;
    private List<Item> totalItems;

    public Rucksack(List<Item> items) {
        this.totalItems = items;
        this.compartment1 = new Compartment(new ArrayList<>());
        this.compartment2 = new Compartment(new ArrayList<>());
        distributeItems(items, compartment1, compartment2);
    }

    private void distributeItems(List<Item> items, Compartment c1, Compartment c2) {
        int numItems = items.size();
        for (int i = 1; i <= numItems; i++) {
            if( i > (numItems / 2) ) {
                c2.getItems().add(items.get(i - 1));
            }
            else {
                c1.getItems().add(items.get(i - 1));
            }
        }
    }

    public Compartment getCompartment1() {
        return compartment1;
    }

    public Compartment getCompartment2() {
        return compartment2;
    }

    public Item getDuplicateItem(Compartment c1, Compartment c2) {
        Map<Integer,Item> itemsByPriority = new HashMap<>();
        Item item = null;
        for (Item i : c1.getItems()) {
            if(!itemsByPriority.containsKey(i.getPriority())) {
                itemsByPriority.put(i.getPriority(), i);
            }
        }
        for (Item i : c2.getItems()) {
            if(itemsByPriority.containsKey(i.getPriority())) {
                item = itemsByPriority.get(i.getPriority());
            }
        }
        return item;
    }

    public List<Item> getTotalItems() {
        return totalItems;
    }

    @Override
    public String toString() {
        return "Rucksack{" +
                "compartment1=" + compartment1 +
                ", compartment2=" + compartment2 +
                '}';
    }

    public static void main(String[] args) {
        String test = "vJrwpWtwJgWrhcsFMMfFFhFp";
        List<Item> items = new ArrayList<>();
        for (char c : test.toCharArray()) {
            items.add(new Item(c));
        }
        Rucksack rucksack = new Rucksack(items);
        System.out.println(rucksack.getCompartment1().getItems().toString());
        System.out.println(rucksack.getCompartment1().getItems().size());
        System.out.println(rucksack.getCompartment2().getItems().toString());
        System.out.println(rucksack.getCompartment2().getItems().size());
        System.out.println(rucksack.getDuplicateItem(rucksack.getCompartment1(), rucksack.getCompartment2()));
    }
}
