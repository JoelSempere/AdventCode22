package day8;

import java.util.ArrayList;
import java.util.List;

public class ScoreTree {
    int height;
    private List<Integer> right;
    private List<Integer> left;
    private List<Integer> up;
    private List<Integer> down;
    private int score;

    public ScoreTree(int height) {
        this.score = 0;
        this.height = height;
        this.down = new ArrayList<>();
        this.right = new ArrayList<>();
        this.left = new ArrayList<>();
        this.up = new ArrayList<>();
    }

    public void calculateScore() {
        this.score = getTrees(right, height) * getTrees(left, height) * getTrees(up, height) * getTrees(down, height);
    }

    private int getTrees(List<Integer> trees, int myTree) {
        int cont = 0;
        for (int tree : trees) {
            if (myTree > tree) {
                cont ++;
            }
            else {
                cont ++;
                break;
            }
        }
        return cont;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Integer> getRight() {
        return right;
    }

    public void setRight(List<Integer> right) {
        this.right = right;
    }

    public List<Integer> getLeft() {
        return left;
    }

    public void setLeft(List<Integer> left) {
        this.left = left;
    }

    public List<Integer> getUp() {
        return up;
    }

    public void setUp(List<Integer> up) {
        this.up = up;
    }

    public List<Integer> getDown() {
        return down;
    }

    public void setDown(List<Integer> down) {
        this.down = down;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
