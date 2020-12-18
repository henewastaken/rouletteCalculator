package bets;


import java.util.ArrayList;
import java.util.List;

/**
 * Class for 3rd dozen bet. 
 * 25-36. Win 2 to 1.
 * @author hene
 */
public class ThirdDozen extends Bets { 
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public ThirdDozen(int bet) {
        super.bet = bet; // Tell Bets class the bet amount.
        super.payout = 2; // Tell Bets class the payout multiplier.
    }

    /**
     * Method for checking if bet won or not.
     *
     * @param number, the correct number for win.
     * @return true if won, false if lost.
     */
    @Override

    public boolean doesWin(int number) {
        if (number >= 25 && number <= 36) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "3rd dozen {numbers= [25-36], payout=" + super.payout + '}';
    }
}
