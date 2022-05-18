package Clean_code.BaiTapRefactoring;

public class TennisGame {
    public static String TiSoHoa(int m_score1) {
        String score = "";
        switch (m_score1) {
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
        return score;
    }

    public static String SapThang(int m_score1, int m_score2) {
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) return "Advantage player1";
        else if (minusResult == -1) return "Advantage player2";
        else if (minusResult >= 2) return "Win for player1";
        else return "Win for player2";

    }

    public static String TiSoTrongTran(int m_score1, int m_score2) {
        int tempScore = 0;
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = m_score1;
            else {
                score += "-";
                tempScore = m_score2;
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
        return score;
    }

    public static void HienTiSo(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore = 0;
        boolean HOA = m_score1 == m_score2;
        boolean SAPTHANG = m_score1 >= 4 || m_score2 >= 4;

        if (HOA) {
            System.out.println(TiSoHoa(m_score1));
        } else if (SAPTHANG) {
            SapThang( m_score1,m_score2);
        } else {
            TiSoTrongTran(m_score1, m_score2);
        }
    }
}





