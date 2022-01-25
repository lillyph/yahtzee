
import java.util.Scanner;

public class YahtzeeDriver
{
/* YahtzeeDriver TODO:
        1. Create a new instance of the YahtzeeGame class.
        2. Call the playGame method on the created instance.
        3. Ask the user if they would like to play again, and repeat the game until the user says no.
        4. When the user is done playing, print the number of games played, in addition to the min score,
//           max score, and average score of all games. These values should be calculated within this code.
//    */

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String play;
        int score;
        int minScore = 999;
        int maxScore = -999;
        int scoreSum = 0;
        int timesPlayed = 0;
        do {
            System.out.println("Welcome to Lilly's AP CSA Yahtzee Game!!");
            YahtzeeGame game = new YahtzeeGame();
            timesPlayed++;
            score = game.playGame();
            if (score < minScore)
                minScore = score;
            if (score > maxScore)
                maxScore = score;
            scoreSum += score;
            System.out.println("Great game! Would you like to play again? Enter 'y' for yes and 'n' for no: ");
            play = s.nextLine();
        } while (play.equals("y"));
        System.out.println("You have chosen to end the game. \nTimes played: " + timesPlayed);
        System.out.println("Min score: " + minScore);
        System.out.println("Max score: " + maxScore);
        System.out.println("Average score: " + scoreSum / timesPlayed);
    }
}

