public class App {
    public static void main(String[] args) throws Exception {
        // challenge to create two methods
        // First method should have two parameters,
        // one for a player's name and the other for
        // a player's position in a high score list.
        // Second method should print a message like
        // "Tim managed to get into position 2 on the high score table".
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out
                .println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }

}
