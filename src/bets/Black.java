package bets;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for black bet. 
 * Numbers 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35. 
 * Win 1 to 1.
 * @author hene
 */
public class Black extends Bets { 
    int[] numbers = new int[] {	2, 4, 6, 8, 10, 11,
                                13, 15, 17, 20, 22, 24,
                                26, 28, 29, 31, 33, 35}; // Array for betted numbers
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public Black (int bet) {
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
        return "Black {" + "numbers=" + nums + ", payout=" + super.payout + '}';
    }
}
