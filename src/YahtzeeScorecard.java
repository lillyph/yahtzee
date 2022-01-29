/**
 * Yahtzee 2
 * Author: Lilly Phan
 * Collaborator(s): used w3schools to learn how to initialize arrays and access elements https://www.w3schools.com/java/java_arrays.asp
 * Date: 1/18/2022
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: LP
 **/

public class YahtzeeScorecard {
    private static int ones = -1;
    private static int twos = -1;
    private static int threes = -1;
    private static int fours = -1;
    private static int fives = -1;
    private static int sixes = -1;
    private static int threeKind = -1;
    private static int fourKind = -1;
    private static int yahtzee = -1;
    private static int chance = -1;
    private static int fullHouse = -1;
    private static int smStraight = -1;
    private static int lgStraight = -1;
    private static boolean bonus = false;
    private static int yahtzeeBonus = 0;

    public YahtzeeScorecard() { }

    public int getOnes(){
        return ones;
    }

    public int getTwos(){
        return twos;
    }

    public int getThrees(){
        return threes;
    }

    public int getFours(){
        return fours;
    }

    public int getFives(){
        return fives;
    }

    public int getSixes(){
        return sixes;
    }

    public int getThreeKind(){
        return threeKind;
    }

    public int getFourKind(){
        return fourKind;
    }

    public int getFullHouse(){
        return fullHouse;
    }

    public int getSmStraight(){
        return smStraight;
    }

    public int getLgStraight(){
        return lgStraight;
    }

    public int getYahtzee(){
        return yahtzee;
    }

    public int getYahtzeeBonus(){
        return yahtzeeBonus;
    }

    public int getChance(){
        return chance;
    }

    public boolean markOnes(int var1, int var2, int var3, int var4, int var5) {
        if (ones != -1)
            return false;
        else {
            ones = 0;
            if (var1 == 1)
                ones++;
            if (var2 == 1)
                ones++;
            if (var3 == 1)
                ones++;
            if (var4 == 1)
                ones++;
            if (var5 == 1)
                ones++;
            return true;
        }
    }

    public boolean markTwos(int var1, int var2, int var3, int var4, int var5) {

        if (twos != -1)
            return false;
        else {
            twos = 0;
            if (var1 == 2)
                twos += 2;
            if (var2 == 2)
                twos += 2;
            if (var3 == 2)
                twos += 2;
            if (var4 == 2)
                twos += 2;
            if (var5 == 2)
                twos += 2;
            return true;
        }
    }

    public boolean markThrees(int var1, int var2, int var3, int var4, int var5) {

        if (threes != -1)
            return false;
        else {
            threes = 0;
            if (var1 == 3)
                threes += 3;
            if (var2 == 3)
                threes += 3;
            if (var3 == 3)
                threes += 3;
            if (var4 == 3)
                threes += 3;
            if (var5 == 3)
                threes += 3;
            return true;
        }
    }

    public boolean markFours(int var1, int var2, int var3, int var4, int var5) {

        if (fours != -1)
            return false;
        else {
            fours = 0;
            if (var1 == 4)
                fours += 4;
            if (var2 == 4)
                fours += 4;
            if (var3 == 4)
                fours += 4;
            if (var4 == 4)
                fours += 4;
            if (var5 == 4)
                fours += 4;
            return true;
        }
    }

    public boolean markFives(int var1, int var2, int var3, int var4, int var5) {
        if (fives != -1)
            return false;
        else {
            fives = 0;
            if (var1 == 5)
                fives += 5;
            if (var2 == 5)
                fives += 5;
            if (var3 == 5)
                fives += 5;
            if (var4 == 5)
                fives += 5;
            if (var5 == 5)
                fives += 5;
            return true;
        }
    }

    public boolean markSixes(int var1, int var2, int var3, int var4, int var5) {
        if (sixes != -1)
            return false;
        else {
            sixes = 0;
            if (var1 == 6)
                sixes += 6;
            if (var2 == 6)
                sixes += 6;
            if (var3 == 6)
                sixes += 6;
            if (var4 == 6)
                sixes += 6;
            if (var5 == 6)
                sixes += 6;
            return true;
        }
    }

    public boolean markThreeOfAKind(int var1, int var2, int var3, int var4, int var5) {
        if (threeKind != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            if (sorter.getFirst() == sorter.getThird() || sorter.getThird() == sorter.getFifth()) { //checks for instances like 1 1 1 3 4 or 4 5 6 6 6
                threeKind = var1 + var2 + var3 + var4 + var5;
            } else if (sorter.getSecond() == sorter.getFourth()){ //checks for instances like 2 5 5 5 6
                threeKind = var1 + var2 + var3 + var4 + var5;
            } else {
                threeKind = 0;
            }
            return true;
        }
    }

    public boolean markFourOfAKind(int var1, int var2, int var3, int var4, int var5) {
        if (fourKind != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            if (sorter.getFirst() == sorter.getFourth()) { //checks for instances like 2 2 2 2 4
                fourKind = var1 + var2 + var3 + var4 + var5;
            } else if (sorter.getSecond() == sorter.getFifth()){ //checks for instances like 1 3 3 3 3
                fourKind = var1 + var2 + var3 + var4 + var5;
            } else {
                fourKind = 0;
            }
            return true;
        }
    }

    public boolean markFullHouse(int var1, int var2, int var3, int var4, int var5) {
        if (fullHouse != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            if (sorter.getFirst() == sorter.getThird() && sorter.getFourth() == sorter.getFifth()) { //checks for instances like 4 4 4 5 5
                fullHouse = 25;
            } else if (sorter.getThird() == sorter.getFifth() && sorter.getFirst() == sorter.getSecond()) { //checks for instances like 4 4 5 5 5
                fullHouse = 25;
            } else {
                fullHouse = 0;
            }
            return true;
        }
    }

    public boolean markSmallStraight(int var1, int var2, int var3, int var4, int var5) {
        if (smStraight != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            int [] dice = {sorter.getFirst(), sorter.getSecond(), sorter.getThird(), sorter.getFourth(), sorter.getFifth()}; //array to loop through die efficiently
            int straightCounter = 0; //counter tracks how many consecutive numbers are present
            int current = dice[0]; //last number that was a consecutive
            for (int i = 0; i < dice.length; i++){ //iterates through array and checks for consecutive numbers that iterate by one
                if (current + 1 == dice[i]){ //if the next element is a consecutive number to the current, update current and the count
                    current = dice[i];
                    straightCounter++;
                }
                if (straightCounter >= 3) { //if there are 3 instances of the next element being consecutive, there are 4 consecutive nums
                    smStraight = 30;
                    return true;
                }
            }
            smStraight = 0;
            return true;
        }
    }

    public boolean markLargeStraight(int var1, int var2, int var3, int var4, int var5) {
        if (lgStraight != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            if (sorter.getFirst() + 4 == sorter.getFifth()) { //covers both possibilities 1 2 3 4 5 and 2 3 4 5 6
                lgStraight = 40;
            } else {
                lgStraight = 0;
            }
            return true;
        }
    }

    public boolean markYahtzee(int var1, int var2, int var3, int var4, int var5) {
        YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
        if (yahtzee != -1){
            if (sorter.getFirst() == sorter.getFifth()) //even if yahtzee has been marked, if it is a yahtzee then yahtzee bonus is applied
                yahtzeeBonus++;
            return false;
        } else {
            if (sorter.getFirst() == sorter.getFifth()) {
                yahtzee = 50;
            } else {
                yahtzee = 0;
            }
            return true;
        }
    }

    public boolean markChance(int var1, int var2, int var3, int var4, int var5) {

        if (chance != -1){
            return false;
        } else {
            chance = var1 + var2 + var3 + var4 + var5;
            return true;
        }
    }

    public int getUpperTotal() {
        int extraOnes = 0; //accounts for the gap in total when scores are == to -1
        int [] totalNums = {ones, twos, threes, fours, fives, sixes}; //array to easily loop through scores, see header for source
        for (int i = 0; i < totalNums.length; i++) { //loops through elements and checks for -1 values
            if (totalNums[i] == -1)
                extraOnes++;
        }
        int sum = ones + twos + threes + fours + fives + sixes + extraOnes;
        if (sum >= 63) {
            sum += 35;
            bonus = true;
        }
        return sum;
    }

    public int getUpperBonus() {
        if (bonus){
            return 35;
        } else {
            return 0;
        }
    }

    public int getLowerTotal() {
        int extraOnes = 0; //same deal here!
        int [] totalNums = {threeKind, fourKind, fullHouse, smStraight, lgStraight, yahtzee, chance};
        for (int i = 0; i < totalNums.length; i++) {
            if (totalNums[i] == -1)
                extraOnes++;
        }
        return threeKind + fourKind + fullHouse + smStraight + lgStraight + yahtzee + chance + yahtzeeBonus * 100 + extraOnes;
    }

    public int getGrandTotal() {
        return getLowerTotal() + getUpperTotal();
    }

    public void printScoreCard() {
        if (this.ones == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.ones);
        }

        if (this.twos == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.twos);
        }

        if (this.threes == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.threes);
        }

        if (this.fours == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fours);
        }

        if (this.fives == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fives);
        }

        if (this.sixes == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.sixes);
        }

        if (this.bonus) {
            System.out.print("35");
        } else {
            System.out.print("0");
        }

        if (this.threeKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.threeKind);
        }

        if (this.fourKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fourKind);
        }

        if (this.fullHouse == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fullHouse);
        }

        if (this.smStraight == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.smStraight);
        }

        if (this.lgStraight == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.lgStraight);
        }

        if (this.yahtzee == -1) {
            System.out.print("\t__");
        } else {
            System.out.print("\t" + this.yahtzee);
        }

        if (this.yahtzeeBonus == 0) {
            System.out.print("\t__");
        } else {
            System.out.print(this.yahtzeeBonus * 100);
        }

        if (this.chance == -1) {
            System.out.print("\t__");
        } else {
            System.out.print("\t" + this.chance);
        }

        System.out.print(this.getLowerTotal());

        System.out.print(this.getGrandTotal());

    }
}
