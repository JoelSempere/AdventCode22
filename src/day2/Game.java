package day2;

public class Game {
    Player playerOne;
    Player playerTwo;
    Integer scoreOne;
    Integer scoreTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.scoreOne = 0;
        this.scoreTwo = 0;
        this.playGame(playerOne, playerTwo);
    }

    private void playGame(Player p1, Player p2) {
        for (int i = 0; i < p1.gameRealized.size(); i++) {
            scoreOne += getScorePlay(p1.gameRealized.get(i), p2.gameRealized.get(i), true);
            scoreTwo += getScorePlay(p1.gameRealized.get(i), p2.gameRealized.get(i), false);
        }
    }

    private Integer getScorePlay(RPS p1, RPS p2, Boolean isPlayer1) {
        return isPlayer1 ? getScorePlayer(p1, p2) : getScorePlayer(p2, p1);
    }

    private Integer getScorePlayer(RPS p1, RPS p2) {
        int score = 0;
        /*switch(p1.value) {
            case 1:
                if( p2.value == 1) {
                    score = 4;
                }
                else if(p2.value == 2) {
                    score = 1;
                } else {
                    score = 7;
                }
                break;
            case 2:
                if( p2.value == 1) {
                    score = 8;
                }
                else if(p2.value == 2) {
                    score = 5;
                } else {
                    score = 2;
                }
                break;
            case 3:
                if( p2.value == 1) {
                    score = 3;
                }
                else if(p2.value == 2) {
                    score = 9;
                } else {
                    score = 6;
                }
                break;

        }*/
        switch(p1.value) {
            case 1:
                if( p2.value == 1) {
                    score = 3;
                }
                else if(p2.value == 2) {
                    score = 4;
                } else {
                    score = 8;
                }
                break;
            case 2:
                if( p2.value == 1) {
                    score = 1;
                }
                else if(p2.value == 2) {
                    score = 5;
                } else {
                    score = 9;
                }
                break;
            case 3:
                if( p2.value == 1) {
                    score = 2;
                }
                else if(p2.value == 2) {
                    score = 6;
                } else {
                    score = 7;
                }
                break;

        }
        return score;
    }

    public Integer getScorePlayer1() {
        return scoreOne;
    }

    public Integer getScorePlayer2() {
        return scoreTwo;
    }

}
