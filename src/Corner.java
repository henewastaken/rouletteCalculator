
import java.util.ArrayList;
import java.util.List;

/**
 * Class for Corner bet. Four cornering numbers. Win 8 to 1.
 * @author hene
 */
public class Corner extends Bets { 

    int[] numbers; // Array for betted numbers
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     * @param numbers, a list that have the betted numbers.
     */
    public Corner(int bet, int[] numbers) {
        super.bet = bet; // Tell Bets class the bet amount.
        super.payout = 8; // Tell Bets class the payout multiplier.
//        super.bankroll -= bet; // Subtract bet form bankroll;
        this.numbers = numbers;
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
        return "Corner {" + "numbers=" + nums + ", payout=" + super.payout + '}';
    }
}
