package day7;

import java.util.ArrayList;
import java.util.List;

public class Dir {
    private Dir parent;
    private List<Dir> chDirs;
    private List<Doc> chDocs;
    private String name;
    private int size;

    public Dir() {
        this.name = "root";
        this.parent = null;
        this.chDirs = new ArrayList<>();
        this.chDocs = new ArrayList<>();
        this.size = 0;
    }

    public Dir(Dir parent, String name) {
        this.parent = parent;
        this.name = name;
        this.chDirs = new ArrayList<>();
        this.chDocs = new ArrayList<>();
        this.size = 0;
    }

    public void addDir(Dir directory) {
        this.getChDirs().add(directory);
    }

    public void addDoc(Doc document) {
        this.getChDocs().add(document);
        this.addSize(document.getSize());
    }

    private void addSize(int size) {
        this.size += size;
        if (this.getParent() != null) {
            this.getParent().addSize(size);
        }
    }

    public Dir getParent() {
        return parent;
    }

    public void setParent(Dir parent) {
        this.parent = parent;
    }

    public List<Dir> getChDirs() {
        return chDirs;
    }

    public void setChDirs(List<Dir> chDirs) {
        this.chDirs = chDirs;
    }

    public List<Doc> getChDocs() {
        return chDocs;
    }

    public void setChDocs(List<Doc> chDocs) {
        this.chDocs = chDocs;
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
