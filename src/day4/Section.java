package day4;

import java.util.ArrayList;
import java.util.List;

public class Section {
    List<Integer> s1;
    List<Integer> s2;
    Boolean isFullyContained;
    Boolean isOverlap;

    public Section(String line) {
        this.s1 = new ArrayList<>();
        this.s2 = new ArrayList<>();
        fillSection(line,this.s1, this.s2);
        this.isFullyContained = checkIfIsFullyContained(this.s1, this.s2);
        this.isOverlap = checkIfIsOverlap(this.s1, this.s2);
    }

    private Boolean checkIfIsOverlap(List<Integer> s1, List<Integer> s2) {
        return s1.size() > s2.size() ? iterateAndCheckOverlap(s1,s2) : iterateAndCheckOverlap(s2,s1);
    }

    private Boolean iterateAndCheckOverlap(List<Integer> big, List<Integer> small) {
        boolean overlap = false;
        for (Integer i: small) {
            if(big.contains(i)) {
                overlap = true;
                break;
            }
        }
        return overlap;
    }

    private Boolean checkIfIsFullyContained(List<Integer> s1, List<Integer> s2) {
        return s1.size() > s2.size() ? iterateAndCheckList(s1,s2) : iterateAndCheckList(s2,s1);
    }

    private Boolean iterateAndCheckList(List<Integer> big, List<Integer> small) {
        boolean isFullyContained = true;
        for (Integer i: small) {
            if(!big.contains(i)) {
                isFullyContained = false;
                break;
            }
        }
        return isFullyContained;
    }

    private void fillSection(String line, List<Integer> s1, List<Integer> s2) {
        List<String> ranges = List.of(line.split(","));
        fillRange(ranges.get(0), s1);
        fillRange(ranges.get(1), s2);
    }

    private void fillRange(String s, List<Integer> s1) {
        int start = Integer.parseInt(s.split("-")[0]);
        int end = Integer.parseInt(s.split("-")[1]);
        for (int i = start; i <= end ; i++) {
            s1.add(i);
        }
    }

    @Override
    public String toString() {
        return "Section{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                ", isFullyContained=" + isFullyContained +
                '}';
    }
}
