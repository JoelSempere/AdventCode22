package day2;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<RPS> gameRealized = new ArrayList<>();

    public Player(List<String> selections) {
        this.gameRealized = generateRPS(selections);
    }

    private List<RPS> generateRPS(List<String> selections) {
        List<RPS> RPSList = new ArrayList<>();
        for (String select : selections) {
            RPS rps = switch (select) {
                case "A" -> RPS.A;
                case "B" -> RPS.B;
                case "C" -> RPS.C;
                case "X" -> RPS.X;
                case "Y" -> RPS.Y;
                case "Z" -> RPS.Z;
                default -> null;
            };
            RPSList.add(rps);
        }
        return RPSList;
    }
}
