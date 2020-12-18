package bets;


import java.util.ArrayList;
import java.util.List;

/**
 * Class for odd bet. 
 * Odd numbers. Win 1 to 1.
 * @author hene
 */
public class Odd extends Bets { 
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public Odd(int bet) {
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
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Odd {numbers= [odd], payout=" + super.payout + '}';
    }
}
