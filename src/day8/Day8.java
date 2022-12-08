package day8;

import Utils.ReadUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Day8 {
    List<List<Integer>> numsList;
    private int visible;
    private int hidden;
    private List<ScoreTree> scoreTrees = new ArrayList<>();

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

        if (!isHiddenDR || !isHiddenTL) {
            ScoreTree st = new ScoreTree(current);
            fillScoreTree(numsList, i, j, st);
            st.calculateScore();
            scoreTrees.add(st);
        }
    }

    private void fillScoreTree(List<List<Integer>> numsList, int i, int j, ScoreTree st) {

        for (int k = i + 1; k < numsList.size(); k++) {
            st.getDown().add(numsList.get(k).get(j));

        }
        for (int l = j + 1; l < numsList.get(i).size(); l++) {
            st.getRight().add(numsList.get(i).get(l));
        }

        for (int k = i - 1 ; k >= 0; k--) {
            st.getUp().add(numsList.get(k).get(j));

        }

        for (int l = j - 1; l >= 0; l--) {
            st.getLeft().add(numsList.get(i).get(l));
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
        //****P2***//
        int score = 0;
        for (ScoreTree st : d8.scoreTrees) {
            if(st.getScore() > score) {
                score = st.getScore();
                System.out.println("Down " + st.getDown());
                System.out.println("Right " + st.getRight());
                System.out.println("Up " + st.getUp());
                System.out.println("Left " + st.getLeft());
                System.out.println("------");
            }
        }
        System.out.println("Best score " + score);

    }
}
