package bets;


import java.util.ArrayList;
import java.util.List;

/**
 * Class for 1-18 bet. 
 * Numbers 1-18. Win 1 to 1.
 * @author hene
 */
public class FirstHalf extends Bets { 
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public FirstHalf(int bet) {
        super.bet = bet; // Tell Bets class the bet amount.
        super.payout = 1; // Tell Bets class the payout multiplier.
    }

    /**
     * Method for checking if bet won or not.
     *
     * @param number, the correct number for win.
     * @return true if won, false if lost.
     */
    @Override
    public boolean doesWin(int number) {
        if (number >= 1 && number <= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "First half {numbers= [1-18], payout=" + super.payout + '}';
    }
}
