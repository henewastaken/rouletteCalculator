
import java.util.ArrayList;
import java.util.List;


/**
 * Class for Basket bet. 
 * Bet is numbers 0, 00, 1, 2, 3. Win 6 to 1.
 * @author henea
 */
class Basket extends Bets{
    int[] number;
    int payout; // Multiplier for win amount.
    
    /**
     * Constructor method
     * @param bet the bet amount
     */
    public Basket(int bet) {
        super.bet = bet; // Tell Bets class the bet amount.
        super.payout = 6; // Tell Bets class the payout multiplier.
//        super.bankroll -= bet; // Subtract bet form bankroll;
        this.numbers = new int[] {0, 00, 1, 2, 3};

    }
    
    /**
     * Method for checking if bet won or not.
     * @param number, the correct number for win.
     * @return true if won, false if lost.
     */
    @Override
    boolean doesWin(int number) {
        // Convert int[] --> List.
        List<Integer> nums = new ArrayList<>();
        for (int i: this.numbers) {
            nums.add(i);
        }
        return nums.contains(number);
    }

    @Override
    public String toString() {
        // Convert int[] --> List.
        List<Integer> nums = new ArrayList<>();
        for (int i: this.numbers) {
            nums.add(i);
        }
        return "Bakset {" + "number=" + nums + ", payout=" + super.payout + '}';
    }
    
    
}
