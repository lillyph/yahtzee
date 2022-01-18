/**
 * Yahtzee 1
 * Author: Lilly Phan
 * Collaborator(s): N/A
 * Date: 01/12/2022
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: LP
 **/

import java.util.*;

public class YahtzeeDie
{
    private Random r = new Random();
    private int value;
    private boolean isFrozen;

    public YahtzeeDie()
    {
        value = r.nextInt(6) + 1;
        isFrozen = false;
    }

    public void rollDie()
    {
        value = r.nextInt(6) + 1;
    }

    public int getValue()
    {
        return value;
    }

    public void freezeDie()
    {
        isFrozen = true;
    }

    public void unfreezeDie()
    {
        isFrozen = false;
    }

    public boolean isFrozen()
    {
        return isFrozen;
    }

}