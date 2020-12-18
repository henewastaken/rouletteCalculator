
import java.util.ArrayList;
import java.util.List;

/**
 * Class for even bet. 
 * Odd numbers. Win 1 to 1.
 * @author hene
 */
public class Even extends Bets { 
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public Even(int bet) {
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
    boolean doesWin(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Even {numbers= [even], payout=" + super.payout + '}';
    }
}
