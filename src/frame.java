import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame implements ActionListener {
    
    private JButton b = new JButton();
    public JButton freezeSubmit = new JButton("submit");
    public String frozenDie;
    private JPanel table = new JPanel();
    private JLabel die1 = new JLabel();
    private JLabel die2 = new JLabel();
    private JLabel die3 = new JLabel();
    private JLabel die4 = new JLabel();
    private JLabel die5 = new JLabel();

    private JCheckBox die1box = new JCheckBox();
    private JCheckBox die2box = new JCheckBox();
    private JCheckBox die3box = new JCheckBox();
    private JCheckBox die4box = new JCheckBox();
    private JCheckBox die5box = new JCheckBox();

    public int choice;
    public int rollquestionmark = 69;
    private ButtonGroup markOptions = new ButtonGroup();
    JPanel scorecardPanel = new JPanel();
    YahtzeeScorecard s = new YahtzeeScorecard();

    //radio buttons on scorecardPanel
    JRadioButton onesButton = new JRadioButton();
    JRadioButton twosButton = new JRadioButton();
    JRadioButton threesButton = new JRadioButton();
    JRadioButton foursButton = new JRadioButton();
    JRadioButton fivesButton = new JRadioButton();
    JRadioButton sixesButton = new JRadioButton();
    JRadioButton threeKindButton = new JRadioButton();
    JRadioButton fourKindButton = new JRadioButton();
    JRadioButton fullHouseButton = new JRadioButton();
    JRadioButton smStraighButton = new JRadioButton();
    JRadioButton lgStraightButton = new JRadioButton();
    JRadioButton yahtzeeButton = new JRadioButton();
    JRadioButton chanceButton = new JRadioButton();

    //scorecard sections
    JLabel ones = new JLabel("  Ones                                   |\t");  
    JLabel twos = new JLabel("  Twos                                   |");  
    JLabel threes = new JLabel("  Threes                                |");  
    JLabel fours = new JLabel("  Fours                                  |");  
    JLabel fives = new JLabel("  Fives                                   |");  
    JLabel sixes = new JLabel("  Sixes                                   |");  
    JLabel upperBonus = new JLabel("  Upper Section Bonus             |");  
    JLabel upperTotal = new JLabel("  Upper Total                         |");  
    JLabel threeKind = new JLabel("  3 of a Kind                          |");  
    JLabel fourKind = new JLabel("  4 of a Kind                          |");  
    JLabel fullHouse = new JLabel("  Full House                           |");  
    JLabel smStraight = new JLabel("  Small Straight                       |");  
    JLabel lgStraight = new JLabel("  Large Straight                       |");  
    JLabel yahtzee = new JLabel("  Yahtzee                               |");
    JLabel chance = new JLabel("  Chance                                |");  
    JLabel upperTotal1 = new JLabel("  Upper Total                         |");  
    JLabel lowerTotal = new JLabel("  Lower Total                          |");  
    JLabel grandTotal = new JLabel("  Grand Total                         |");  

    //prompt options
    public JButton roll = new JButton("Roll");
    private JLabel prompts = new JLabel("Click one of the options below");
    private JButton satisfied = new JButton("Satisfied");

    public frame() {
        Border thickb = BorderFactory.createLineBorder(Color.black, 5);
        Border thinb = BorderFactory.createLineBorder(Color.black, 1);

        JLabel title = new JLabel("Yahtzee scorecard");
        title.setForeground(Color.black);
        title.setFont(new Font("Garamond", Font.PLAIN, 20));
        title.setBounds(60, 15, 275, 50);
        title.setVisible(true);

        //upper scorecardPanel section

        JLabel upperTitle = new JLabel("  Upper Section");  
        upperTitle.setBorder(thinb);
        upperTitle.setBackground(Color.lightGray);
        upperTitle.setFont(new Font("Garamond", Font.PLAIN, 16));
        upperTitle.setBounds(10, 70, 280, 30);
        upperTitle.setVisible(true);

        ones.setBorder(thinb);
        ones.setFont(new Font("Garamond", Font.PLAIN, 12));
        ones.setBounds(10, 100, 280, 30);
        ones.setVisible(true);

        twos.setBorder(thinb);
        twos.setFont(new Font("Garamond", Font.PLAIN, 12));
        twos.setBounds(10, 130, 280, 30);
        twos.setVisible(true);

        threes.setBorder(thinb);
        threes.setFont(new Font("Garamond", Font.PLAIN, 12));
        threes.setBounds(10, 160, 280, 30);
        threes.setVisible(true);

        fours.setBorder(thinb);
        fours.setFont(new Font("Garamond", Font.PLAIN, 12));
        fours.setBounds(10, 190, 280, 30);
        fours.setVisible(true);

        fives.setBorder(thinb);
        fives.setFont(new Font("Garamond", Font.PLAIN, 12));
        fives.setBounds(10, 220, 280, 30);
        fives.setVisible(true);

        sixes.setBorder(thinb);
        sixes.setFont(new Font("Garamond", Font.PLAIN, 12));
        sixes.setBounds(10, 250, 280, 30);
        sixes.setVisible(true);

        upperBonus.setBorder(thinb);
        upperBonus.setFont(new Font("Garamond", Font.PLAIN, 12));
        upperBonus.setBounds(10, 280, 280, 30);
        upperBonus.setVisible(true);

        upperTotal.setBorder(thinb);
        upperTotal.setFont(new Font("Garamond", Font.PLAIN, 12));
        upperTotal.setBounds(10, 310, 280, 30);
        upperTotal.setVisible(true);

        //lower section

        JLabel lowerTitle = new JLabel("  Lower Section");  
        lowerTitle.setBorder(thinb);
        lowerTitle.setBackground(Color.lightGray);
        lowerTitle.setFont(new Font("Garamond", Font.PLAIN, 16));
        lowerTitle.setBounds(10, 340, 280, 30);
        lowerTitle.setVisible(true);

        threeKind.setBorder(thinb);
        threeKind.setFont(new Font("Garamond", Font.PLAIN, 12));
        threeKind.setBounds(10, 370, 280, 30);
        threeKind.setVisible(true);

        fourKind.setBorder(thinb);
        fourKind.setFont(new Font("Garamond", Font.PLAIN, 12));
        fourKind.setBounds(10, 400, 280, 30);
        fourKind.setVisible(true);

        fullHouse.setBorder(thinb);
        fullHouse.setFont(new Font("Garamond", Font.PLAIN, 12));
        fullHouse.setBounds(10, 430, 280, 30);
        fullHouse.setVisible(true);

        smStraight.setBorder(thinb);
        smStraight.setFont(new Font("Garamond", Font.PLAIN, 12));
        smStraight.setBounds(10, 460, 280, 30);
        smStraight.setVisible(true);

        lgStraight.setBorder(thinb);
        lgStraight.setFont(new Font("Garamond", Font.PLAIN, 12));
        lgStraight.setBounds(10, 490, 280, 30);
        lgStraight.setVisible(true);

        yahtzee.setBorder(thinb);
        yahtzee.setFont(new Font("Garamond", Font.PLAIN, 12));
        yahtzee.setBounds(10, 520, 280, 30);
        yahtzee.setVisible(true);

        chance.setBorder(thinb);
        chance.setFont(new Font("Garamond", Font.PLAIN, 12));
        chance.setBounds(10, 550, 280, 30);
        chance.setVisible(true);

        //all totals

        upperTotal1.setBorder(thinb);
        upperTotal1.setBackground(Color.lightGray);
        upperTotal1.setFont(new Font("Garamond", Font.PLAIN, 12));
        upperTotal1.setBounds(10, 580, 280, 30);
        upperTotal1.setVisible(true);

        lowerTotal.setBorder(thinb);
        lowerTotal.setBackground(Color.lightGray);
        lowerTotal.setFont(new Font("Garamond", Font.PLAIN, 12));
        lowerTotal.setBounds(10, 610, 280, 30);
        lowerTotal.setVisible(true);

        grandTotal.setBorder(thinb);
        grandTotal.setBackground(Color.lightGray);
        grandTotal.setFont(new Font("Garamond", Font.PLAIN, 12));
        grandTotal.setBounds(10, 640, 280, 30);
        grandTotal.setVisible(true);

        scorecardPanel.setLayout(null);
        scorecardPanel.add(title);
        scorecardPanel.setBorder(thickb);
        scorecardPanel.add(upperTitle);
        scorecardPanel.add(ones);
        scorecardPanel.add(twos);
        scorecardPanel.add(threes);
        scorecardPanel.add(fours);
        scorecardPanel.add(fives);
        scorecardPanel.add(sixes);
        scorecardPanel.add(upperBonus);
        scorecardPanel.add(upperTotal);
        scorecardPanel.add(lowerTitle);
        scorecardPanel.add(threeKind);
        scorecardPanel.add(fourKind);
        scorecardPanel.add(fullHouse);
        scorecardPanel.add(smStraight);
        scorecardPanel.add(lgStraight);
        scorecardPanel.add(yahtzee);
        scorecardPanel.add(chance);
        scorecardPanel.add(upperTotal1);
        scorecardPanel.add(lowerTotal);
        scorecardPanel.add(grandTotal);

        JPanel topBorder = new JPanel();
        JPanel rightBorder= new JPanel();
        JPanel botBorder = new JPanel();

        scorecardPanel.setBackground(Color.white);
        topBorder.setBackground(new Color(24, 54, 26));
        rightBorder.setBackground(new Color(24, 54, 26));
        botBorder.setBackground(new Color(24, 54, 26));

        scorecardPanel.setBounds(0, 0, 300, 800);
        topBorder.setBounds(300, 0, 400, 25);
        rightBorder.setBounds(675, 0, 25, 800);
        botBorder.setBounds(300, 755, 400, 25);

        //visible die presets
        die1.setBounds(205, 70, 100, 100);
        die1.setBackground(Color.blue);
        die1.setVisible(false);

        die2.setBounds(205, 190, 100, 100);
        die2.setVisible(false);

        die3.setBounds(205, 310, 100, 100);
        die3.setVisible(false);

        die4.setBounds(205, 430, 100, 100);
        die4.setVisible(false);

        die5.setBounds(205, 550, 100, 100);
        die5.setVisible(false);

        //freezedie boxes

        die1box.setVisible(false);
        die1box.setBounds(160,90,50,50);

        die2box.setVisible(false);
        die2box.setBounds(160,210,50,50);

        die3box.setVisible(false);
        die3box.setBounds(160,330,50,50);

        die4box.setVisible(false);
        die4box.setBounds(160,450,50,50);

        die5box.setVisible(false);
        die5box.setBounds(160,570,50,50);

        //radio buttons

        onesButton.setBounds(195,95,100,40);
        twosButton.setBounds(195,125,40,40);
        threesButton.setBounds(195,155,40,40);
        foursButton.setBounds(195,185,40,40);
        fivesButton.setBounds(195,215,40,40);
        sixesButton.setBounds(195,245,40,40);
        threeKindButton.setBounds(195,365,40,40);
        fourKindButton.setBounds(195,395,40,40);
        fullHouseButton.setBounds(195,425,40,40);
        smStraighButton.setBounds(195,455,40,40);
        lgStraightButton.setBounds(195,485,40,40);
        yahtzeeButton.setBounds(195,515,40,40);
        chanceButton.setBounds(195,545,40,40);

        markOptions.add(onesButton);
        markOptions.add(twosButton);
        markOptions.add(threesButton);
        markOptions.add(foursButton);
        markOptions.add(fivesButton);
        markOptions.add(sixesButton);
        markOptions.add(threeKindButton);
        markOptions.add(fourKindButton);
        markOptions.add(fullHouseButton);
        markOptions.add(smStraighButton);
        markOptions.add(lgStraightButton);
        markOptions.add(yahtzeeButton);
        markOptions.add(chanceButton);

        onesButton.addActionListener(this);
        twosButton.addActionListener(this);
        threesButton.addActionListener(this);
        foursButton.addActionListener(this);
        fivesButton.addActionListener(this);
        sixesButton.addActionListener(this);
        threeKindButton.addActionListener(this);
        fourKindButton.addActionListener(this);
        fullHouseButton.addActionListener(this);
        smStraighButton.addActionListener(this);
        lgStraightButton.addActionListener(this);
        yahtzeeButton.addActionListener(this);
        chanceButton.addActionListener(this);

        scorecardPanel.add(onesButton);
        scorecardPanel.add(twosButton);
        scorecardPanel.add(threesButton);
        scorecardPanel.add(foursButton);
        scorecardPanel.add(fivesButton);
        scorecardPanel.add(sixesButton);
        scorecardPanel.add(threeKindButton);
        scorecardPanel.add(fourKindButton);
        scorecardPanel.add(fullHouseButton);
        scorecardPanel.add(smStraighButton);
        scorecardPanel.add(lgStraightButton);
        scorecardPanel.add(yahtzeeButton);
        scorecardPanel.add(chanceButton);
        scorecardPanel.add(b);

        //table panel

        table.setLayout(null);
        table.setFont(new Font("Garamond", Font.PLAIN, 12));
        table.setBounds(325, 30, 325, 700);
        table.setBackground(new Color(53, 112, 69));
        table.setVisible(true);
        table.add(prompts);
        table.add(roll);
        table.add(satisfied);
        table.add(die1);
        table.add(die2);
        table.add(die3);
        table.add(die4);
        table.add(die5);
        table.add(die1box);
        table.add(die2box);
        table.add(die3box);
        table.add(die4box);
        table.add(die5box);
        table.add(freezeSubmit);

        this.add(table);

        //main frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,800);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(53, 112, 69));
        this.setTitle("Yahtzee");
        this.add(scorecardPanel);
        this.add(topBorder);
        this.add(rightBorder);
        this.add(botBorder);
        this.setVisible(true);
    }

    public void updateScorecard() {
        JLabel[] scoreSections = {ones, twos, threes, fours, fives, sixes, upperTotal, upperBonus, threeKind, fourKind, fullHouse, smStraight, lgStraight, yahtzee, chance, upperTotal1, lowerTotal, grandTotal};
        int[] scoreValues = {s.getOnes(), s.getTwos(), s.getThrees(), s.getFours(), s.getFives(), s.getSixes(), s.getUpperTotal(), s.getUpperBonus(), s.getThreeKind(), s.getFourKind(), s.getFullHouse(), s.getSmStraight(), s.getLgStraight(), s.getYahtzee(), s.getChance(), s.getUpperTotal(), s.getLowerTotal(), s.getGrandTotal()};
        for (int i = 0; i < scoreSections.length; i++){
            if (scoreValues[i] != -1)
                scoreSections[i].setText(scoreSections[i].getText() + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + scoreValues[i]);
        }
    }

    public void rollPrompt(){
        roll.setBounds(110, 70, 80, 30);
        roll.setVisible(true);
        roll.setFocusable(false);
        roll.addActionListener(e -> rollquestionmark = 420);

        satisfied.setBounds(20, 70, 80, 30);
        satisfied.setVisible(true);
        satisfied.setFocusable(false);
        satisfied.addActionListener(e -> markScore());

        prompts.setForeground(Color.white);
        prompts.setFont(new Font("Garamond", Font.PLAIN, 20));
        prompts.setBounds(10, 10, 315, 60);
        prompts.setVisible(true);
    }

    public void hideRollPrompt(){
        roll.setVisible(false);
        satisfied.setVisible(false);
        prompts.setVisible(false);
    }

    public void freezePrompt(){
        frozenDie = "";

        prompts.setText("Select die to freeze");
        prompts.setVisible(true);

        die1box.setVisible(true);
        die2box.setVisible(true);
        die3box.setVisible(true);
        die4box.setVisible(true);
        die5box.setVisible(true);

        freezeSubmit.setBounds(220, 670, 60, 20);
        freezeSubmit.addActionListener(this);
        freezeSubmit.setVisible(true);
    }

    public void hideFreezePrompt(){
        prompts.setVisible(false);

        die1box.setVisible(false);
        die2box.setVisible(false);
        die3box.setVisible(false);
        die4box.setVisible(false);
        die5box.setVisible(false);

        freezeSubmit.setVisible( false);
    }

    public void hideMarkScore() {
        onesButton.setVisible(false);
        twosButton.setVisible(false);
        threesButton.setVisible(false);
        foursButton.setVisible(false);
        fivesButton.setVisible(false);
        sixesButton.setVisible(false);
        threeKindButton.setVisible(false);
        fourKindButton.setVisible(false);
        fullHouseButton.setVisible(false);
        smStraighButton.setVisible(false);
        lgStraightButton.setVisible(false);
        yahtzeeButton.setVisible(false);
        chanceButton.setVisible(false);
        b.setVisible(false);
    }

    public void displayDie(int[] dieValues) throws InterruptedException {
        ImageIcon val1 = new ImageIcon("die1 copy.png");
        ImageIcon val2 = new ImageIcon("die2 copy.png");
        ImageIcon val3 = new ImageIcon("die3 copy.png");
        ImageIcon val4 = new ImageIcon("die4 copy.png");
        ImageIcon val5 = new ImageIcon("die5 copy.png");
        ImageIcon val6 = new ImageIcon("die6 copy.png");

        JLabel[] dieLabel = {die1, die2, die3, die4, die5};
        for (int i = 0; i < dieValues.length; i++){
            Thread.sleep(500);
            switch (dieValues[i]) {
                case 1: dieLabel[i].setIcon(val1); break;
                case 2: dieLabel[i].setIcon(val2); break;
                case 3: dieLabel[i].setIcon(val3); break;
                case 4: dieLabel[i].setIcon(val4); break;
                case 5: dieLabel[i].setIcon(val5); break;
                case 6: dieLabel[i].setIcon(val6); break;
            }
            dieLabel[i].setVisible(true);
        }
    }

    public void hideDie(){
        die1.setVisible(false);
        die2.setVisible(false);
        die3.setVisible(false);
        die4.setVisible(false);
        die5.setVisible(false);
    }

    public void markScore(){
        onesButton.setVisible(true);
        twosButton.setVisible(true);
        threesButton.setVisible(true);
        foursButton.setVisible(true);
        fivesButton.setVisible(true);
        sixesButton.setVisible(true);
        threeKindButton.setVisible(true);
        fourKindButton.setVisible(true);
        fullHouseButton.setVisible(true);
        smStraighButton.setVisible(true);
        lgStraightButton.setVisible(true);
        yahtzeeButton.setVisible(true);
        chanceButton.setVisible(true);

        b.setText("submit");
        b.setBounds(110, 690, 70, 30);
        b.addActionListener(this);
        b.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            boolean scoreUpdated = false;
            do {
                if (onesButton.isSelected()){
                    onesButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 1;
                } else if (twosButton.isSelected()){
                    twosButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 2;
                } else if (threesButton.isSelected()){
                    threesButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 3;
                } else if (foursButton.isSelected()){
                    foursButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 4;
                } else if (fivesButton.isSelected()){
                    fivesButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 5;
                } else if (sixesButton.isSelected()){
                    sixesButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 6;
                } else if (threeKindButton.isSelected()){
                    threeKindButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 7;
                } else if (fourKindButton.isSelected()){
                    fourKindButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 8;
                } else if (fullHouseButton.isSelected()){
                    fullHouseButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 9;
                } else if (smStraighButton.isSelected()){
                    smStraighButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 10;
                } else if (lgStraightButton.isSelected()){
                    lgStraightButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 11;
                } else if (yahtzeeButton.isSelected()){
                    yahtzeeButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 12;
                } else if (chanceButton.isSelected()){
                    chanceButton.setEnabled(false);
                    scoreUpdated = true;
                    choice = 13;
                } else {
                    choice = -1;
                }
            } while (!scoreUpdated);

            hideDie();
        }
        if (e.getSource() == freezeSubmit){
            JCheckBox[] checkBoxes = {die1box, die2box, die3box, die4box, die5box};
            for (int i = 0; i < 5; i++) {
                if (checkBoxes[i].isSelected()) {
                    frozenDie = frozenDie + (i + 1);
                }
            }
        }

    }

}

