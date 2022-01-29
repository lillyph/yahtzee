
import java.util.Scanner;

public class YahtzeeDriver
{

    public static void main(String [] args) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        String play;
        int score;
        int minScore = 999;
        int maxScore = -999;
        int scoreSum = 0;
        int timesPlayed = 0;
//        do {
            YahtzeeGame game = new YahtzeeGame();
//            timesPlayed++;
            score = game.playGame();
//            if (score < minScore)
//                minScore = score;
//            if (score > maxScore)
//                maxScore = score;
//            scoreSum += score;
//            System.out.println("Great game! Would you like to play again? Enter 'y' for yes and 'n' for no: ");
//            play = s.nextLine();
//        } while (play.equals("y"));
//        System.out.println("You have chosen to end the game. \nTimes played: " + timesPlayed);
//        System.out.println("Min score: " + minScore);
//        System.out.println("Max score: " + maxScore);
//        System.out.println("Average score: " + scoreSum / timesPlayed);
    }
}

