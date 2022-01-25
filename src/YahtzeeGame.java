/**
 * Yahtzee 3
 * Author: Lilly Phan
 * Collaborator(s): N/A
 * Date: 1/21/22
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: LP
 **/

import java.util.*;

public class YahtzeeGame {

    public static final int NUM_SIDES = 6;
    //TODO: create 5 new YahtzeeDie objects as instance variables here (one for each of the 5 dice):
    private YahtzeeDie dieOne = new YahtzeeDie();
    private YahtzeeDie dieTwo = new YahtzeeDie();
    private YahtzeeDie dieThree = new YahtzeeDie();
    private YahtzeeDie dieFour = new YahtzeeDie();
    private YahtzeeDie dieFive = new YahtzeeDie();
    private frame f = new frame('c');

    //TODO: create a new YahtzeeScorecard object as instance data here:
    private YahtzeeScorecard scorecard = new YahtzeeScorecard();

    public YahtzeeGame() {
    }

    public int playGame() {
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn(); //13 turns
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        scorecard.printScoreCard();
        return scorecard.getGrandTotal(); //return total so it can be used to calculate min/max and average
    }

    private void takeTurn() {
        rollDice();
        f.displayDie(getDie());
        Scanner s = new Scanner(System.in);
        String userInput;
        System.out.print("Are you (s)atisfied or to you want to (r)oll again and freeze some dice? (s/r): ");
        userInput = s.nextLine();
        int count = 0;
        if (userInput.equals("r")) { //two if statements to achieve exactly three rolls
            chooseFrozen();
            rollDice();
            f.displayDie(getDie());
            System.out.print("Are you (s)atisfied or to you want to (r)oll again and freeze some dice? (s/r): ");
            if (userInput.equals("r")) {
                chooseFrozen();
                rollDice();
                f.displayDie(getDie());
            }
        }
        markScore(); //mark score whether user chooses s or r
    }

    private void rollDice() {
        //dieOne
        if (dieOne.isFrozen())
            dieOne.unfreezeDie();
        else
            dieOne.rollDie();
        //dieTwo
        if (dieTwo.isFrozen())
            dieTwo.unfreezeDie();
        else
            dieTwo.rollDie();
        //dieThree
        if (dieThree.isFrozen())
            dieThree.unfreezeDie();
        else
            dieThree.rollDie();
        //dieFour
        if (dieFour.isFrozen())
            dieFour.unfreezeDie();
        else
            dieFour.rollDie();
        //dieFive
        if (dieFive.isFrozen())
            dieFive.unfreezeDie();
        else
            dieFive.rollDie();
    }

    private void chooseFrozen() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter which dice to freeze (1-5). Enter them all in one line (ex: 1,2,5 or 134 or 2 5): ");
        String userFreezeDie = s.nextLine();
        for (int i = 0; i < userFreezeDie.length(); i++){ //for loop to iterate through string and find values 1-5
            if ((int)userFreezeDie.charAt(i) > 48 && (int)userFreezeDie.charAt(i) < 54) { //checks if any of the die are specified in string
                int die = (int)userFreezeDie.charAt(i); //cast to dec value so i can use it with a switch
                switch (die){ //switch statement to freeze appropriate die
                    case 49: dieOne.freezeDie(); break;
                    case 50: dieTwo.freezeDie(); break;
                    case 51: dieThree.freezeDie(); break;
                    case 52: dieFour.freezeDie(); break;
                    case 53: dieFive.freezeDie(); break;
                    default:
                }
            }
        }

    }

    private int[] getDie() {
        return new int[]{dieOne.getValue(), dieTwo.getValue(), dieThree.getValue(), dieFour.getValue(), dieFive.getValue()};
    }

    private void markScore() {
        boolean scoreUpdated = false;
        int userScored;
        int one = dieOne.getValue();
        int two = dieTwo.getValue();
        int three = dieThree.getValue(); //assigned die values to identifiers to make code below concise
        int four = dieFour.getValue();
        int five = dieFive.getValue();
        Scanner s = new Scanner(System.in);
        //do while loops to prompt user until at least one until one of the scores have been updated
        do {
            scorecard.printScoreCard();

            do { //another loop to reprompt until user chooses a valid option
                System.out.println("Where would you like to place your score?");
                System.out.println("1. Ones \t7.  3 of Kind");
                System.out.println("2. Twos \t8.  4 of Kind");
                System.out.println("3. Threes \t9.  Full House");
                System.out.println("4. Fours \t10. Sm Straight");
                System.out.println("5. Fives \t11. Lg Straight");
                System.out.println("6. Sixes \t12. Yahtzee");
                System.out.println("\t\t\t13. Chance");
                System.out.print("Enter 1-13: ");
                userScored = s.nextInt(); //update user input
            } while (userScored > 13 || userScored < 1);
            //step 1c
                switch (userScored) { //switch to identify and mark correct option
                    //step 1c1
                    case 1:
                        scoreUpdated = scorecard.markOnes(one, two, three, four, five);
                        break;
                    case 2:
                        scoreUpdated = scorecard.markTwos(one, two, three, four, five);
                        break;
                    case 3:
                        scoreUpdated = scorecard.markThrees(one, two, three, four, five);
                        break;
                    case 4:
                        scoreUpdated = scorecard.markFours(one, two, three, four, five);
                        break;
                    case 5:
                        scoreUpdated = scorecard.markFives(one, two, three, four, five);
                        break;
                    case 6:
                        scoreUpdated = scorecard.markSixes(one, two, three, four, five);
                        break;
                    case 7:
                        scoreUpdated = scorecard.markThreeOfAKind(one, two, three, four, five);
                        break;
                    case 8:
                        scoreUpdated = scorecard.markFourOfAKind(one, two, three, four, five);
                        break;
                    case 9:
                        scoreUpdated = scorecard.markFullHouse(one, two, three, four, five);
                        break;
                    case 10:
                        scoreUpdated = scorecard.markSmallStraight(one, two, three, four, five);
                        break;
                    case 11:
                        scoreUpdated = scorecard.markLargeStraight(one, two, three, four, five);
                        break;
                    case 12:
                        scoreUpdated = scorecard.markYahtzee(one, two, three, four, five);
                        break;
                    case 13:
                        scoreUpdated = scorecard.markChance(one, two, three, four, five);
                        break;
                    default:

                }
        } while (!scoreUpdated);
    }
}
