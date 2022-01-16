/* This class is already completed - do not edit!
This class sorts the 5 dice values into ascending order. These sorted values can be accessed by using the methods
below (getFirst(), getSecond(), getThird(), getFourth(), and getFifth()). */

public class YahtzeeSortDice {
    int first;
    int second;
    int third;
    int fourth;
    int fifth;

    public YahtzeeSortDice(int var1, int var2, int var3, int var4, int var5) {
        int var6;
        if (var2 < var1) {
            var6 = var2;
            var2 = var1;
            var1 = var6;
        }

        if (var3 < var1) {
            var6 = var3;
            var3 = var2;
            var2 = var1;
            var1 = var6;
        } else if (var3 < var2) {
            var6 = var3;
            var3 = var2;
            var2 = var6;
        }

        if (var4 < var1) {
            var6 = var4;
            var4 = var3;
            var3 = var2;
            var2 = var1;
            var1 = var6;
        } else if (var4 < var2) {
            var6 = var4;
            var4 = var3;
            var3 = var2;
            var2 = var6;
        } else if (var4 < var3) {
            var6 = var4;
            var4 = var3;
            var3 = var6;
        }

        if (var5 < var1) {
            var6 = var5;
            var5 = var4;
            var4 = var3;
            var3 = var2;
            var2 = var1;
            var1 = var6;
        }

        if (var5 < var2) {
            var6 = var5;
            var5 = var4;
            var4 = var3;
            var3 = var2;
            var2 = var6;
        }

        if (var5 < var3) {
            var6 = var5;
            var5 = var4;
            var4 = var3;
            var3 = var6;
        }

        if (var5 < var4) {
            var6 = var5;
            var5 = var4;
            var4 = var6;
        }

        this.first = var1;
        this.second = var2;
        this.third = var3;
        this.fourth = var4;
        this.fifth = var5;
    }

    public int getFirst() {
        return this.first;
    }

    public int getSecond() {
        return this.second;
    }

    public int getThird() {
        return this.third;
    }

    public int getFourth() {
        return this.fourth;
    }

    public int getFifth() {
        return this.fifth;
    }
}
