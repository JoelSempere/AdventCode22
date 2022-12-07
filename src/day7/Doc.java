package day7;

public class Doc {
    private Dir parent;
    private String name;
    private int size;

    public Doc(Dir parent, String name, int size) {
        this.parent = parent;
        this.name = name;
        this.size = size;
    }

    public Dir getParent() {
        return parent;
    }

    public void setParent(Dir parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
