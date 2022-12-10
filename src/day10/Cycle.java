package day10;

import java.util.List;

public class Cycle {
    private int position;
    private int valueX; // valor real
    private int signalStrength; //ciclo 20 y cada 40 ciclos, (posicion * valorX)

    public Cycle(int position, int valueX) {
        this.position = position;
        this.valueX = valueX;
        this.signalStrength = setSignalStrength(valueX, position);
    }

    public int setSignalStrength(int valueX, int position) {
        return position * valueX;
    }

    public void setValueX(int valueX) {
        this.valueX = valueX;
    }

    public int getPosition() {
        return position;
    }

    public int getValueX() {
        return valueX;
    }

    public int getSignalStrength() {
        return signalStrength;
    }

    public static String printPixel(int position, int valueX) {
        int i = (position - 1) % 40;
        return (i == 0 ? "\n" :  " ") + (List.of(valueX - 1, valueX, valueX + 1).contains(i) ? '#' : '.');
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "position=" + position +
                ", valueX=" + valueX +
                ", Strength=" + signalStrength +
                '}';
    }
}
