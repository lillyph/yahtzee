public class YahtzeeScorecard {
    private int ones = -1;
    private int twos = -1;
    private int threes = -1;
    private int fours = -1;
    private int fives = -1;
    private int sixes = -1;
    private int threeKind = -1;
    private int fourKind = -1;
    private int yahtzee = -1;
    private int chance = -1;
    private int fullHouse = -1;
    private int smStraight = -1;
    private int lgStraight = -1;
    private boolean bonus = false;
    private int yahtzeeBonus = 0;

    public YahtzeeScorecard() { }


    /* markOnes TODO:
        1. If the instance variable "ones" is not equal to -1 (meaning the score has already been updated) then
           return false.
        2. Otherwise:
            a. Count the number of ones. The arguments "var1" through "var5" represent the values of the 5 dice,
               so you will want to use these to figure out the number of ones.
            b. Update the instance variable "ones" based on the number of ones you counted.
            c. Return true.
     */
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

    // TODO: markTwos should be the same as markOnes, but with the appropriate variables/values.
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

    // TODO: markThrees should be the same as markOnes, but with the appropriate variables/values.
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

    // TODO: markFours should be the same as markOnes, but with the appropriate variables/values.
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

    // TODO: markFives should be the same as markOnes, but with the appropriate variables/values.
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

    // TODO: markSixes should be the same as markOnes, but with the appropriate variables/values.
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

    /* markThreeOfAKind TODO:
        1. If the instance variable "threeKind" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has three of a kind (aka at least three dice with the same value).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have three of a kind, add up all the dice values and update the "threeKind" instance variable.
               If they do not have a three of a kind, set "threeKind" to 0.
            d. Return true.
     */
    public boolean markThreeOfAKind(int var1, int var2, int var3, int var4, int var5) {
        if (threeKind != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            if (sorter.getFirst() == sorter.getThird() || sorter.getThird() == sorter.getFifth()) {
                threeKind = var1 + var2 + var3 + var4 + var5;
            } else if (sorter.getSecond() == sorter.getFourth()){
                threeKind = var1 + var2 + var3 + var4 + var5;
            } else {
                threeKind = 0;
            }
            return true;
        }
    }

    /* markFourOfAKind TODO:
        1. If the instance variable "fourKind" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has a four of a kind (aka at least four dice with the same value).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have four of a kind, add up all the dice values and update the "fourKind" instance variable.
               If they do not have a four of a kind, set "fourKind" to 0.
            d. Return true.
     */
    public boolean markFourOfAKind(int var1, int var2, int var3, int var4, int var5) {
        if (fourKind != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            if (sorter.getFirst() == sorter.getFourth()) {
                fourKind = var1 + var2 + var3 + var4 + var5;
            } else if (sorter.getSecond() == sorter.getFifth()){
                fourKind = var1 + var2 + var3 + var4 + var5;
            } else {
                fourKind = 0;
            }
            return true;
        }
    }

    /* markFullHouse TODO:
        1. If the instance variable "fullHouse" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has a Full House (aka three of the dice have the same value and the
               other two dice have the same value. Ex: 5   5   5   4   4, or 2   2   3   3   2, or 1   2   1   2   1).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have a Full House, update the "fullHouse" instance variable to be 25.
               If they do not have a Full House, set "fullHouse" to 0.
            d. Return true.
     */
    public boolean markFullHouse(int var1, int var2, int var3, int var4, int var5) {
        if (fullHouse != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            if (sorter.getFirst() == sorter.getThird() && sorter.getFourth() == sorter.getFifth()) {
                fullHouse = 25;
            } else if (sorter.getThird() == sorter.getFifth() && sorter.getFirst() == sorter.getSecond()) {
                fullHouse = 25;
            } else {
                fullHouse = 0;
            }
            return true;
        }
    }

    /* markSmallStraight TODO:
        1. If the instance variable "smStraight" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has a small straight (aka a sequence of 4 sequential numbers.
               Ex: 1   2   3   4   2 or 4   2   3   4   5 ).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have a small straight, update the "smStraight" instance variable to 30.
               If they do not have a small straight, set "smStraight" to 0.
            d. Return true.
     */

    //NEEDS SERIOUS WORK PLEASE FIX
    public boolean markSmallStraight(int var1, int var2, int var3, int var4, int var5) {
        if (smStraight != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5); //3 4 4 5 6
            if (sorter.getFirst() + 3 == sorter.getFourth() || sorter.getSecond() + 3 == sorter.getFifth()) {
                smStraight = 30;
            } else {
                smStraight = 0;
            }
            return true;
        }
    }

    /* markLargeStraight TODO:
        1. If the instance variable "lgStraight" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has a large straight (aka a sequence of 5 sequential numbers.
               Ex: 1   2   3   4   5 or 2   3   4   5   6).
            b.
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have a large straight, update the "lgStraight" instance variable to 40.
               If they do not have a large straight, set "lgStraight" to 0.
            d. Return true.
     */
    public boolean markLargeStraight(int var1, int var2, int var3, int var4, int var5) {
        if (lgStraight != -1){
            return false;
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
            if (sorter.getFirst() + 4 == sorter.getFifth()) {
                lgStraight = 40;
            } else {
                lgStraight = 0;
            }
            return true;
        }
    }

    /* markYahtzee TODO:
        1. If the instance variable "yahtzee" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Check if the player actually has a Yahtzee (aka all dice are the same value).
            c. If they do have a Yahtzee, update the "yahtzee" instance variable to 50.
               If they do not have a yahtzee, set "yahtzee" to 0.
            d. Return true.
     */
    public boolean markYahtzee(int var1, int var2, int var3, int var4, int var5) {
        YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5);
        if (yahtzee != -1){
            if (sorter.getFirst() == sorter.getFifth())
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
        for (int i = 0; i < totalNums.length; i++) { //loops and checks for -1 values
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

    //notice: this method is slightly edited just to adjust formatting (including adding a yahtzee bonus)! no major function changes have been made

    public void printScoreCard() {
        System.out.println();
        System.out.println("*********************************");
        System.out.println("*      Yahtzee Score Card       *");
        System.out.println("*                               *");
        System.out.print("*  Ones:\t\t");
        if (this.ones == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.ones);
        }

        System.out.println("\t\t\t\t*");
        System.out.print("*  Twos:\t\t");
        if (this.twos == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.twos);
        }

        System.out.println("\t\t\t\t*");
        System.out.print("*  Threes:\t\t");
        if (this.threes == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.threes);
        }

        System.out.println("\t\t\t\t*");
        System.out.print("*  Fours:\t\t");
        if (this.fours == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fours);
        }

        System.out.println("\t\t\t\t*");
        System.out.print("*  Fives:\t\t");
        if (this.fives == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fives);
        }

        System.out.println("\t\t\t\t*");
        System.out.print("*  Sixes:\t\t");
        if (this.sixes == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.sixes);
        }

        System.out.println("\t\t\t\t*");
        System.out.println("*\t\t\t\t\t\t\t\t*");
        System.out.print("*  Upper Bonus:\t\t");
        if (this.bonus) {
            System.out.print("35");
        } else {
            System.out.print("0");
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Upper Total:\t\t");
        System.out.print(this.getUpperTotal());
        System.out.println("\t\t\t*");
        System.out.println("*                               *");
        System.out.print("*  3 of Kind:\t\t");
        if (this.threeKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.threeKind);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  4 of Kind:\t\t");
        if (this.fourKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fourKind);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Full House:\t\t");
        if (this.fullHouse == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fullHouse);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Sm Straight:\t\t");
        if (this.smStraight == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.smStraight);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Lg Straight:\t\t");
        if (this.lgStraight == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.lgStraight);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Yahtzee:\t\t");
        if (this.yahtzee == -1) {
            System.out.print("\t__");
        } else {
            System.out.print("\t" + this.yahtzee);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Yahtzee Bonus:");
        if (this.yahtzeeBonus == 0) {
            System.out.print("\t__");
        } else {
            System.out.print(this.yahtzeeBonus * 100);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Chance:\t\t");
        if (this.chance == -1) {
            System.out.print("\t__");
        } else {
            System.out.print("\t" + this.chance);
        }

        System.out.println("\t\t\t*");
        System.out.println("*                               *");
        System.out.print("*  Lower Total:\t\t");
        System.out.print(this.getLowerTotal());
        System.out.println("\t\t\t*");
        System.out.println("*                               *");
        System.out.print("*  Grand Total:\t\t");
        System.out.print(this.getGrandTotal());
        System.out.println("\t\t\t*");
        System.out.println("**********************************");
        System.out.println();
    }
}
