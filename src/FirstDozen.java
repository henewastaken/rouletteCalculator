
import java.util.ArrayList;
import java.util.List;

/**
 * Class for first dozen bet. 
 * 1-12. Win 2 to 1.
 * @author hene
 */
public class FirstDozen extends Bets { 

    // int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};; // Array for betted numbers
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public FirstDozen(int bet) {
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
    boolean doesWin(int number) {
        if (number >= 1 && number <= 12) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "1st dozen {numbers= [1-12], payout=" + super.payout + '}';
    }
}
