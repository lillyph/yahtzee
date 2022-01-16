import java.util.*;

public class YahtzeeDie
{
	/* TODO: set instance data as follows:
	   your instance data should include a Random number generator named r, an int named value
	   that stores the current value of the die, and a boolean named isFrozen which is true
	   if die is frozen, and false if not. */

    private Random r = new Random();
    private int value;
    private boolean isFrozen;

    /* TODO: initialize your instance data appropriately. */
    public YahtzeeDie()
    {
        value = r.nextInt(6) + 1;
        isFrozen = false;
    }

    /* TODO: set a new value for the die using the Random object. */
    public void rollDie()
    {
        value = r.nextInt(6) + 1;
    }

    /* TODO: get the current die value. */
    public int getValue()
    {
        return value;
    }

    /* TODO: set the value of isFrozen to true. */
    public void freezeDie()
    {
        isFrozen = true;
    }

    /* TODO: set the value of isFrozen to false. */
    public void unfreezeDie()
    {
        isFrozen = false;
    }

    /* TODO: return true if die is frozen, false if it is unfrozen. */
    public boolean isFrozen()
    {
        return isFrozen;
    }

}