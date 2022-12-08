package day8;

import Utils.ReadUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Day8 {
    List<List<Integer>> numsList;
    private int visible;
    private int hidden;

    public Day8(List<List<Integer>> numsList) {
        this.numsList = numsList;
        this.visible = 0;
        this.hidden = 0;
        calculateValues(numsList);
    }

    private void calculateValues(List<List<Integer>> numsList) {
        for (int i = 0; i < numsList.size(); i++) {
            for (int j = 0; j < numsList.get(i).size(); j++) {
                if(visibleByDefault(i, j)) {
                    this.visible ++;
                }
                else {
                    setVisibility(numsList,i, j);
                }
            }

        }

    }

    private void setVisibility(List<List<Integer>> numsList, int i, int j) {
        int current = numsList.get(i).get(j);
        boolean isHiddenDR = false;
        boolean isHiddenTL = false;

        for (int k = i + 1; k < numsList.size(); k++) {
            for (int l = j + 1; l < numsList.get(k).size(); l++) {
                if (numsList.get(i).get(l) >= current && numsList.get(k).get(j) >= current) {
                    isHiddenDR = true;
                    break;
                }
            }
        }

        for (int k = i - 1 ; k >= 0; k--) {
            for (int l = j - 1; l >= 0; l--) {
                if (numsList.get(i).get(l) >= current && numsList.get(k).get(j) >= current) {
                    isHiddenTL = true;
                    break;
                }
            }
        }

        if(isHiddenDR && isHiddenTL) {
            this.hidden ++;
        }
        else {
            this.visible ++;
        }

    }

    private boolean visibleByDefault(int i, int j) {
        return (i == 0 || i == this.numsList.size() - 1 || j == 0 || j == this.numsList.get(i).size() - 1);
    }

    public int getVisible() {
        return visible;
    }

    public int getHidden() {
        return hidden;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Day8 d8 = new Day8(ReadUtils.getNumberMatrix(new File("src\\day8\\input8.txt")));
        System.out.println(d8.getHidden());
        System.out.println(d8.getVisible());

    }
}
