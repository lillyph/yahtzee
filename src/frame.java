import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class frame extends JFrame {

    private JButton b = new JButton();
    private JPanel table = new JPanel();
    private JButton roll = new JButton("Roll");
    private JLabel prompts = new JLabel("Click to Roll");
    private JLabel die1 = new JLabel();
    private JLabel die2 = new JLabel();
    private JLabel die3 = new JLabel();
    private JLabel die4 = new JLabel();
    private JLabel die5 = new JLabel();

    public frame(char c) {
        Border thickb = BorderFactory.createLineBorder(Color.black, 5);
        Border thinb = BorderFactory.createLineBorder(Color.black, 1);

        JLabel title = new JLabel("Yahtzee Scorecard");
        title.setForeground(Color.black);
        title.setFont(new Font("Garamond", Font.PLAIN, 20));
        title.setBounds(60, 15, 275, 50);
        title.setVisible(true);

        //upper scorecard section

        JLabel upperTitle = new JLabel("  Upper Section"); //add a die value to this line
        upperTitle.setBorder(thinb);
        upperTitle.setBackground(Color.lightGray);
        upperTitle.setFont(new Font("Garamond", Font.PLAIN, 16));
        upperTitle.setBounds(10, 70, 280, 30);
        upperTitle.setVisible(true);

        JLabel ones = new JLabel("  Ones                                   |"); //add a die value to this line
        ones.setBorder(thinb);
        ones.setFont(new Font("Garamond", Font.PLAIN, 12));
        ones.setBounds(10, 100, 280, 30);
        ones.setVisible(true);

        JLabel twos = new JLabel("  Twos                                   |"); //add a die value to this line
        twos.setBorder(thinb);
        twos.setFont(new Font("Garamond", Font.PLAIN, 12));
        twos.setBounds(10, 130, 280, 30);
        twos.setVisible(true);

        JLabel threes = new JLabel("  Threes                                |"); //add a die value to this line
        threes.setBorder(thinb);
        threes.setFont(new Font("Garamond", Font.PLAIN, 12));
        threes.setBounds(10, 160, 280, 30);
        threes.setVisible(true);

        JLabel fours = new JLabel("  Fours                                  |"); //add a die value to this line
        fours.setBorder(thinb);
        fours.setFont(new Font("Garamond", Font.PLAIN, 12));
        fours.setBounds(10, 190, 280, 30);
        fours.setVisible(true);

        JLabel fives = new JLabel("  Fives                                   |"); //add a die value to this line
        fives.setBorder(thinb);
        fives.setFont(new Font("Garamond", Font.PLAIN, 12));
        fives.setBounds(10, 220, 280, 30);
        fives.setVisible(true);

        JLabel sixes = new JLabel("  Sixes                                   |"); //add a die value to this line
        sixes.setBorder(thinb);
        sixes.setFont(new Font("Garamond", Font.PLAIN, 12));
        sixes.setBounds(10, 250, 280, 30);
        sixes.setVisible(true);

        //upper total and bonus section

        JLabel upperBonus = new JLabel("  Upper Section Bonus             |"); //add a die value to this line
        upperBonus.setBorder(thinb);
        upperBonus.setFont(new Font("Garamond", Font.PLAIN, 12));
        upperBonus.setBounds(10, 280, 280, 30);
        upperBonus.setVisible(true);

        JLabel upperTotal = new JLabel("  Upper Total                         |"); //add a die value to this line
        upperTotal.setBorder(thinb);
        upperTotal.setFont(new Font("Garamond", Font.PLAIN, 12));
        upperTotal.setBounds(10, 310, 280, 30);
        upperTotal.setVisible(true);

        //lower section

        JLabel lowerTitle = new JLabel("  Lower Section"); //add a die value to this line
        lowerTitle.setBorder(thinb);
        lowerTitle.setBackground(Color.lightGray);
        lowerTitle.setFont(new Font("Garamond", Font.PLAIN, 16));
        lowerTitle.setBounds(10, 340, 280, 30);
        lowerTitle.setVisible(true);

        JLabel threeKind = new JLabel("  3 of a Kind                          |"); //add a die value to this line
        threeKind.setBorder(thinb);
        threeKind.setFont(new Font("Garamond", Font.PLAIN, 12));
        threeKind.setBounds(10, 370, 280, 30);
        threeKind.setVisible(true);

        JLabel fourKind = new JLabel("  4 of a Kind                          |"); //add a die value to this line
        fourKind.setBorder(thinb);
        fourKind.setFont(new Font("Garamond", Font.PLAIN, 12));
        fourKind.setBounds(10, 400, 280, 30);
        fourKind.setVisible(true);

        JLabel fullHouse = new JLabel("  Full House                           |"); //add a die value to this line
        fullHouse.setBorder(thinb);
        fullHouse.setFont(new Font("Garamond", Font.PLAIN, 12));
        fullHouse.setBounds(10, 430, 280, 30);
        fullHouse.setVisible(true);

        JLabel smStraight = new JLabel("  Small Straight                       |"); //add a die value to this line
        smStraight.setBorder(thinb);
        smStraight.setFont(new Font("Garamond", Font.PLAIN, 12));
        smStraight.setBounds(10, 460, 280, 30);
        smStraight.setVisible(true);

        JLabel lgStraight = new JLabel("  Large Straight                       |"); //add a die value to this line
        lgStraight.setBorder(thinb);
        lgStraight.setFont(new Font("Garamond", Font.PLAIN, 12));
        lgStraight.setBounds(10, 490, 280, 30);
        lgStraight.setVisible(true);

        JLabel yahtzee = new JLabel("  Yahtzee                               |"); //add a die value to this line and BONUS
        yahtzee.setBorder(thinb);
        yahtzee.setFont(new Font("Garamond", Font.PLAIN, 12));
        yahtzee.setBounds(10, 520, 280, 30);
        yahtzee.setVisible(true);

        JLabel chance = new JLabel("  Chance                                |"); //add a die value to this line
        chance.setBorder(thinb);
        chance.setFont(new Font("Garamond", Font.PLAIN, 12));
        chance.setBounds(10, 550, 280, 30);
        chance.setVisible(true);

        //all totals

        JLabel upperTotal1 = new JLabel("  Upper Total                         |"); //add a die value to this line
        upperTotal1.setBorder(thinb);
        upperTotal1.setBackground(Color.lightGray);
        upperTotal1.setFont(new Font("Garamond", Font.PLAIN, 12));
        upperTotal1.setBounds(10, 580, 280, 30);
        upperTotal1.setVisible(true);

        JLabel lowerTotal = new JLabel("  Lower Total                          |"); //add a die value to this line
        lowerTotal.setBorder(thinb);
        lowerTotal.setBackground(Color.lightGray);
        lowerTotal.setFont(new Font("Garamond", Font.PLAIN, 12));
        lowerTotal.setBounds(10, 610, 280, 30);
        lowerTotal.setVisible(true);

        JLabel grandTotal = new JLabel("  Grand Total                         |"); //add a die value to this line
        grandTotal.setBorder(thinb);
        grandTotal.setBackground(Color.lightGray);
        grandTotal.setFont(new Font("Garamond", Font.PLAIN, 12));
        grandTotal.setBounds(10, 640, 280, 30);
        grandTotal.setVisible(true);

        JPanel scorecard = new JPanel();
        scorecard.setLayout(null);
        scorecard.add(title);
        scorecard.setBorder(thickb);
        scorecard.add(upperTitle);
        scorecard.add(ones);
        scorecard.add(twos);
        scorecard.add(threes);
        scorecard.add(fours);
        scorecard.add(fives);
        scorecard.add(sixes);
        scorecard.add(upperBonus);
        scorecard.add(upperTotal);
        scorecard.add(lowerTitle);
        scorecard.add(threeKind);
        scorecard.add(fourKind);
        scorecard.add(fullHouse);
        scorecard.add(smStraight);
        scorecard.add(lgStraight);
        scorecard.add(yahtzee);
        scorecard.add(chance);
        scorecard.add(upperTotal1);
        scorecard.add(lowerTotal);
        scorecard.add(grandTotal);

        JPanel topBorder = new JPanel();
        JPanel rightBorder= new JPanel();
        JPanel botBorder = new JPanel();

        scorecard.setBackground(Color.white);
        topBorder.setBackground(new Color(24, 54, 26));
        rightBorder.setBackground(new Color(24, 54, 26));
        botBorder.setBackground(new Color(24, 54, 26));

        scorecard.setBounds(0, 0, 300, 800);
        topBorder.setBounds(300, 0, 400, 25);
        rightBorder.setBounds(675, 0, 25, 800);
        botBorder.setBounds(300, 755, 400, 25);

        //visible die presets
        die1.setBounds(200, 70, 100, 100);
        die1.setVisible(false);

        die2.setBounds(200, 70, 100, 100);
        die2.setVisible(false);

        die3.setBounds(200, 70, 100, 100);
        die3.setVisible(false);

        die4.setBounds(200, 70, 100, 100);
        die4.setVisible(false);

        die5.setBounds(200, 70, 100, 100);
        die5.setVisible(false);

        //main frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,800);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(53, 112, 69));
        this.setTitle("Yahtzee");
        this.add(scorecard);
        this.add(topBorder);
        this.add(rightBorder);
        this.add(botBorder);
        this.setVisible(true);
    }

    public void rollPrompt(){
        roll.setBounds(110, 70, 80, 30);
        roll.setVisible(true);
        roll.setFocusable(false);

        prompts.setForeground(Color.white);
        prompts.setFont(new Font("Garamond", Font.PLAIN, 30));
        prompts.setBounds(70, 10, 315, 60);
        prompts.setVisible(true);

        table.setLayout(null);
        table.setFont(new Font("Garamond", Font.PLAIN, 12));
        table.setBounds(325, 30, 325, 700);
        table.setBackground(Color.red);
        table.setVisible(true);
        table.add(prompts);
        table.add(roll);
        table.add(die1);
        table.add(die2);
        table.add(die3);
        table.add(die4);
        table.add(die5);

        this.add(table);

    }

    public void displayDie(int[] dieValues){
        ImageIcon val1 = new ImageIcon("dice-six-faces-one.png");
        ImageIcon val2 = new ImageIcon("dice-six-faces-two.png");
        ImageIcon val3 = new ImageIcon("dice-six-faces-three.png");
        ImageIcon val4 = new ImageIcon("dice-six-faces-four.png");
        ImageIcon val5 = new ImageIcon("dice-six-faces-five.png");
        ImageIcon val6 = new ImageIcon("dice-six-faces-six.png");
        JLabel[] visibleDie = {die1, die2, die3, die4, die5};
        for (int i = 0; i < dieValues.length; i++){
            switch (dieValues[i]){
                case 1:
                    visibleDie[i].setIcon(val1);
                    break;
                case 2:
                    visibleDie[i].setIcon(val2);
                    break;
                case 3:
                    visibleDie[i].setIcon(val3);
                    break;
                case 4:
                    visibleDie[i].setIcon(val4);
                    break;
                case 5:
                    visibleDie[i].setIcon(val5);
                    break;
                case 6:
                    visibleDie[i].setIcon(val6);
                    break;
                default:
            }
            visibleDie[i].setVisible(true);
        }
    }

}

