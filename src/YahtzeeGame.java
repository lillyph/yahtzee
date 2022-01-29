import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Yahtzee 3
 * Author: Lilly Phan
 * Collaborator(s): N/A
 * Date: 1/21/22
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: LP
 **/

public class YahtzeeGame extends frame implements ActionListener {

    public boolean cont = true;
    public static final int NUM_SIDES = 6;
    private YahtzeeDie dieOne = new YahtzeeDie();
    private YahtzeeDie dieTwo = new YahtzeeDie();
    private YahtzeeDie dieThree = new YahtzeeDie();
    private YahtzeeDie dieFour = new YahtzeeDie();
    private YahtzeeDie dieFive = new YahtzeeDie();

//    private frame f = new frame();
    private YahtzeeScorecard scorecard = new YahtzeeScorecard();

    public YahtzeeGame() {
    }

    public int playGame() throws InterruptedException{
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
        this.updateScorecard();
        return scorecard.getGrandTotal(); //return total so it can be used to calculate min/max and average
    }

    private void takeTurn() throws InterruptedException{
        rollDice();
        f.displayDie(getDie());
        do
            f.rollPrompt();
        while (!cont);
        f.hideRollPrompt();
        cont = false;
        do
            f.freezePrompt();
        while (!cont);
        cont = false;
        chooseFrozen(f.frozenDie);
        rollDice();
        f.displayDie(getDie());
        do
            f.rollPrompt();
        while (!cont);
        f.rollPrompt();
        if ((f.rollquestionmark == 420)) {
            f.hideRollPrompt();
            chooseFrozen(f.frozenDie);
            rollDice();
            f.displayDie(getDie());
            }
        f.markScore(); //lets user choose from options whether user chooses s or r
        markScore(); //updates value of chosen option
        f.updateScorecard(); //updates the visual scorecard
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

    private void chooseFrozen(String frozenDie) {
        for (int i = 0; i < (frozenDie).length(); i++){
            switch ((frozenDie).charAt(i)){ //switch statement to freeze appropriate die
                case '1': dieOne.freezeDie(); break;
                case '2': dieTwo.freezeDie(); break;
                case '3': dieThree.freezeDie(); break;
                case '4': dieFour.freezeDie(); break;
                case '5': dieFive.freezeDie(); break;
                default:
            }
        }

    }

    private int[] getDie() {
        return new int[]{dieOne.getValue(), dieTwo.getValue(), dieThree.getValue(), dieFour.getValue(), dieFive.getValue()};
    }

    private void markScore() {
        int one = dieOne.getValue();
        int two = dieTwo.getValue();
        int three = dieThree.getValue(); //assigned die values to identifiers to make code below concise
        int four = dieFour.getValue();
        int five = dieFive.getValue();
        switch (f.choice) { //switch to identify and mark correct option
            //step 1c1
            case 1: scorecard.markOnes(one, two, three, four, five); break;
            case 2: scorecard.markTwos(one, two, three, four, five); break;
            case 3: scorecard.markThrees(one, two, three, four, five); break;
            case 4: scorecard.markFours(one, two, three, four, five); break;
            case 5: scorecard.markFives(one, two, three, four, five); break;
            case 6: scorecard.markSixes(one, two, three, four, five); break;
            case 7: scorecard.markThreeOfAKind(one, two, three, four, five); break;
            case 8: scorecard.markFourOfAKind(one, two, three, four, five); break;
            case 9: scorecard.markFullHouse(one, two, three, four, five); break;
            case 10: scorecard.markSmallStraight(one, two, three, four, five); break;
            case 11: scorecard.markLargeStraight(one, two, three, four, five); break;
            case 12: scorecard.markYahtzee(one, two, three, four, five); break;
            case 13: scorecard.markChance(one, two, three, four, five); break;
            default:
                }
        }
