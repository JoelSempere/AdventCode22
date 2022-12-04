package day3;

public class Item {

    private final char letter;
    private final int priority;

    public Item(char letter) {
        this.letter = letter;
        this.priority = getPriority(letter);
    }

    private int getPriority(char letter) {
        int priority = 1;
        int letterPriority = 0;
        for (char alphabet = 'a'; alphabet <= 'z' ; alphabet++) {
            if(alphabet == letter) {
                letterPriority = priority;
                break;

            }
            priority ++;
        }
        if(letterPriority == 0) {
            for (char alphabet = 'A'; alphabet <= 'Z' ; alphabet++) {
                if(alphabet == letter) {
                    letterPriority = priority;
                    break;
                }
                priority ++;
            }
        }
        return letterPriority;
    }

    public char getLetter() {
        return letter;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Item{" +
                "letter=" + letter +
                ", priority=" + priority +
                '}';
    }

    public static void main(String[] args) {
        Item i = new Item('B');
        System.out.println(i.getPriority());
        System.out.println(i.getLetter());
    }
}
