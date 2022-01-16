import java.util.*;

public class YahtzeeGame {

    public static final int NUM_SIDES = 6;
    //TODO: create 5 new YahtzeeDie objects as instance variables here (one for each of the 5 dice):
    private YahtzeeDie dieOne = new YahtzeeDie();
    private YahtzeeDie dieTwo = new YahtzeeDie();
    private YahtzeeDie dieThree = new YahtzeeDie();
    private YahtzeeDie dieFour = new YahtzeeDie();
    private YahtzeeDie dieFive = new YahtzeeDie();

    //TODO: create a new YahtzeeScorecard object as instance data here:
    private YahtzeeScorecard scorecard = new YahtzeeScorecard();

    public YahtzeeGame() {
    }

    /* PlayGame TODO:
        1. Call the method "takeTurn" 13 times. (You will be coding takeTurn later on in this class,
           so feel free to do that first!)
        2. Print the scorecard by calling the method "printScoreCard" on your YahtzeeScorecard object.
        3. Return the grand total by calling the method "getGrandTotal" on your YahtzeeScorecard object.
    */
    public int playGame() {
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        takeTurn();
        scorecard.printScoreCard();
        return scorecard.getGrandTotal();
    }

    /* takeTurn TODO:
        1. Roll the dice by calling the "rollDice" method. (You will be coding rollDice later on in this class,
           so feel free to do that first!)
        2. Print out their first dice roll by calling the "printDice" method. (You will be coding printDice later
           on in this class, so feel free to do that first!)
        3. Ask the player if they are satisfied with their roll or if they want to roll again and freeze some
           dice (prompt already given).
        4. If the user chooses to roll again (enters "r") you should:
             a. Ask them to choose which dice to freeze (make use of the "chooseFrozen" method, below).
             b. Roll the dice again.
             c. Print out their second dice roll.
             d. Prompt the user to choose again (s/r).
             e. If the user chooses to roll again, repeat a-d again for their third roll. (Max 3 rolls allowed.)
        5. If the user chooses "s" after either of the first two rolls, immediately stop and go to step 6.
        6. Call the "markScore" method. (You will be coding markScore later on in this class,
           so feel free to do that first!)
    */
    private void takeTurn() {
        Scanner s = new Scanner(System.in);
        rollDice();
        printDice();
        System.out.print("Are you (s)atisfied or to you want to (r)oll again and freeze some dice? (s/r): ");
        String userInput = s.nextLine();
        int count = 0;
        if (userInput.equals("r")) {
            chooseFrozen();
            rollDice();
            printDice();
            System.out.print("Are you (s)atisfied or to you want to (r)oll again and freeze some dice? (s/r): ");
            userInput = s.nextLine();
            if (userInput.equals("r")) {
                chooseFrozen();
                rollDice();
                printDice();
            }
        }
        markScore();
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
        for (int i = 0; i < userFreezeDie.length(); i++){
            if ((int)userFreezeDie.charAt(i) > 48 && (int)userFreezeDie.charAt(i) < 54) {
                int die = (int)userFreezeDie.charAt(i);
                switch (die){
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

    private void printDice() {
        System.out.println(dieOne.getValue() + " " + dieTwo.getValue() + " " + dieThree.getValue() + " " + dieFour.getValue() + " " + dieFive.getValue());
    }

    /* markScore TODO:
        1. Create a do while loop in which you:
            a. Print the score by calling the "printScoreCard" method.
            b. Create a second do while loop in which you:
                1. Prompt the user for where they want to place their score (sample prompt provided).
                2. Read in their choice.
                3. Repeat until they enter a valid number.
            c. Create a switch statement based on the number the user previously entered for where they want to place
               their score. For each case, you should:
                1. Call the appropriate method from your scorecard object (ex: markOnes, markFullHouse, etc.).
                   Remember that these methods take in the value of all 5 of the dice as their arguments. Additionally,
                   these methods will return true if the corresponding category is empty and has been updated, and
                   will return false if the corresponding category is already full. You should store the returned value
                   into the boolean "scoreUpdated", which is already given. This will be used to check and see if you
                   should re-prompt the user.
                2. Repeat until "scoreUpdated" is true.
    */
    private void markScore() {
        boolean scoreUpdated = false;
        int userScored;
        int one = dieOne.getValue();
        int two = dieTwo.getValue();
        int three = dieThree.getValue();
        int four = dieFour.getValue();
        int five = dieFive.getValue();
        Scanner s = new Scanner(System.in);
        //step 1
        do {
            //step 1a
            scorecard.printScoreCard();
            //step 1b
            do {
                //step 1b1
                System.out.println("Where would you like to place your score?");
                System.out.println("1. Ones \t7.  3 of Kind");
                System.out.println("2. Twos \t8.  4 of Kind");
                System.out.println("3. Threes \t9.  Full House");
                System.out.println("4. Fours \t10. Sm Straight");
                System.out.println("5. Fives \t11. Lg Straight");
                System.out.println("6. Sixes \t12. Yahtzee");
                System.out.println("\t\t\t13. Chance");
                System.out.print("Enter 1-13: ");
                //step 1b2
                userScored = s.nextInt();
                //step 1b3
            } while (userScored > 13 || userScored < 1);
            //step 1c
                switch (userScored) {
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
         //step 1c2
        } while (!scoreUpdated);
    }
}
