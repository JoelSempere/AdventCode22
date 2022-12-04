package day3;

import java.util.*;

public class Group {
    List<Rucksack> rucksacks = new ArrayList<>();
    Integer priority;

    public Group(List<Rucksack> rucksacks) {
        this.rucksacks = rucksacks;
        this.priority = getPriorityInCommon(rucksacks);
    }

    public Integer getPriorityInCommon(List<Rucksack> rucksacks) {
        Map<Integer, Item> itemsByPriority1 = new HashMap<>();
        Map<Integer, Item> itemsByPriority2 = new HashMap<>();
        Map<Integer, Item> itemsByPriority3 = new HashMap<>();
        Rucksack rucksack;
        //Meter en un set todas las prioridades y recorrer esto
        Set<Integer> priorities = new HashSet<>();

        if(rucksacks.get(0).getTotalItems().size() > rucksacks.get(1).getTotalItems().size() && rucksacks.get(0).getTotalItems().size() > rucksacks.get(2).getTotalItems().size()) {
            //usamos 0
            rucksack = rucksacks.get(0);
        }
        else if(rucksacks.get(1).getTotalItems().size() > rucksacks.get(0).getTotalItems().size() && rucksacks.get(1).getTotalItems().size() > rucksacks.get(2).getTotalItems().size()) {
            //usamos 1
            rucksack = rucksacks.get(1);
        }
        else {
          //usamos 2;
            rucksack = rucksacks.get(2);
        }
        fillMap(itemsByPriority1, rucksacks.get(0));
        fillMap(itemsByPriority2, rucksacks.get(1));
        fillMap(itemsByPriority3, rucksacks.get(2));
        priorities.addAll(itemsByPriority1.keySet());
        priorities.addAll(itemsByPriority2.keySet());
        priorities.addAll(itemsByPriority3.keySet());
        //System.out.println(priorities);
        for (Integer priority : priorities) {
            if(itemsByPriority1.containsKey(priority) && itemsByPriority2.containsKey(priority) && itemsByPriority3.containsKey(priority)) {
                return priority;
            }
        }
        return 0;
    }


    private void fillMap(Map<Integer, Item> itemsByPriority, Rucksack rucksack) {
        for (Item i : rucksack.getTotalItems()) {
            if(!itemsByPriority.containsKey(i.getPriority())) {
                itemsByPriority.put(i.getPriority(), i);
            }
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "rucksacks=" + rucksacks +
                ", priority=" + priority +
                '}';
    }
}
