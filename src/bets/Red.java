package bets;


import java.util.ArrayList;
import java.util.List;

/**
 * Class forred bet. 
 * Numbders 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36. 
 * Win 1 to 1.
 * @author hene
 */
public class Red extends Bets { 
    int[] numbers = new int[] {1, 3, 5, 7, 9, 12, 
                               14, 16, 18, 19, 21, 23, 
                               25, 27, 30, 32, 34, 36}; // Array for betted numbers
    int payout; // Multiplier for win amount.

    /**
     * Constructor.
     * @param bet the bet amount
     */
    public Red(int bet) {
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
        return "Red {" + "numbers=" + nums + ", payout=" + super.payout + '}';
    }
}
