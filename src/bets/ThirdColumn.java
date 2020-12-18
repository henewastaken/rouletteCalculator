package bets;


import java.util.ArrayList;
import java.util.List;

/**
 * Class for third column bet. 
 * 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36. Win 2 to 1.
 * @author hene
 */
public class ThirdColumn extends Bets { 

    int[] numbers = new int[] {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};// Array for betted numbers
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public ThirdColumn(int bet) {
        super.bet = bet; // Tell Bets class the bet amount.
        super.payout = 2; // Tell Bets class the payout multiplier.
//        super.bankroll -= bet; // Subtract bet form bankroll;
    }

    /**
     * Method for checking if bet won or not.
     *
     * @param number, the correct number for win.
     * @return true if won, false if lost.
     */
    @Override
    public boolean doesWin(int number) {
        // Convert int[] --> List.
        List<Integer> nums = new ArrayList<>();
        for (int i : this.numbers) {
            nums.add(i);
        }
        return nums.contains(number);
    }

    @Override
    public String toString() {
        // Convert int[] --> List.
        List<Integer> nums = new ArrayList<>();
        for (int i : this.numbers) {
            nums.add(i);
        }
        return "3rd column {" + "numbers=" + nums + ", payout=" + super.payout + '}';
    }
}
