
import java.util.ArrayList;
import java.util.List;

/**
 * Class for First column bet. 
 * 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34. Win 2 to 1.
 * @author hene
 */
public class FirstColumn extends Bets { 

    int[] numbers; // Array for betted numbers
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public FirstColumn(int bet) {
        super.bet = bet; // Tell Bets class the bet amount.
        super.payout = 2; // Tell Bets class the payout multiplier.
//        super.bankroll -= bet; // Subtract bet form bankroll;
        this.numbers = new int[] {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};
    }

    /**
     * Method for checking if bet won or not.
     *
     * @param number, the correct number for win.
     * @return true if won, false if lost.
     */
    @Override
    boolean doesWin(int number) {
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
        return "1st column {" + "numbers=" + nums + ", payout=" + super.payout + '}';
    }
}
