package b8_clean_code_refaction.bai_tap;

public class RefactoringOne {
    static String score = "";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        if (scorePlayer1 == scorePlayer2) {
           veryfiScore(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            very(scorePlayer1,scorePlayer2);
        } else {
            loop(scorePlayer1,scorePlayer2);
        }
        return score;
    }
    public static void veryfiScore(int scorePlayer1) {
        switch (scorePlayer1) {
            case 0:
                score = "Love-All";
            break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }

    }
    public static void very(int scorepl1,int scorepl2){
        int minusResult = scorepl1 - scorepl2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
    }
    public static void loop(int score1, int score2){
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = score1;
            else {
                score += "-";
                tempScore = score2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
    }

    public static void main(String[] args) {
      RefactoringOne a=new RefactoringOne();
        System.out.println(a.getScore("thanh","tu",5,7));
    }
}

