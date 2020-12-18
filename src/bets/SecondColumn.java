package bets;


import java.util.ArrayList;
import java.util.List;

/**
 * Class for second column bet. 
 * 2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35. Win 2 to 1.
 * @author hene
 */
public class SecondColumn extends Bets { 

    int[] numbers; // Array for betted numbers
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public SecondColumn(int bet) {
        super.bet = bet; // Tell Bets class the bet amount.
        super.payout = 2; // Tell Bets class the payout multiplier.
//        super.bankroll -= bet; // Subtract bet form bankroll;
        this.numbers = new int[] {2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35};
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
        return "2nd column {" + "numbers=" + nums + ", payout=" + super.payout + '}';
    }
}
