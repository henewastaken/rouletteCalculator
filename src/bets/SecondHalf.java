package bets;


import java.util.ArrayList;
import java.util.List;

/**
 * Class for 19-36 bet. 
 * Numbers 19-36. Win 1 to 1.
 * @author hene
 */
public class SecondHalf extends Bets { 
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public SecondHalf(int bet) {
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
        if (number >= 19 && number <= 36) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Second half {numbers= [19-36], payout=" + super.payout + '}';
    }
}
