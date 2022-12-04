package day2;
import java.util.List;

public class Day2 {
    public static void main(String[] args) {
       List<String> selectionsP1 = UtilsGame.getList(UtilsGame.getData(), true);
        List<String> selectionsP2 = UtilsGame.getList(UtilsGame.getData(), false);

        Player p1 = new Player(selectionsP1);
        Player p2 = new Player(selectionsP2);
        Game game = new Game(p1, p2);
        System.out.println(game.getScorePlayer1());
        System.out.println(game.getScorePlayer2());
    }
}
