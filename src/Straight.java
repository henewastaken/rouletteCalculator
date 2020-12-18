
/**
 * Class for Straigh bet. 
 * One sumgle number. Win 35 to 1.
 * @author henea
 */
class Straight extends Bets{
    int number;
    int payout; // Multiplier for win amount.
    
    /**
     * Constructor method
     * @param bet the bet amount
     * @param number, number that player bets on.
     */
    public Straight(int bet, int number) {
        super.bet = bet; // Tell Bets class the bet amount.
        super.payout = 35; // Tell Bets class the payout multiplier.
//        super.bankroll -= bet; // Subtract bet form bankroll;
        this.number = number;

    }
    
    /**
     * Method for checking if bet won or not.
     * @param number, the correct number for win.
     * @return true if won, false if lost.
     */
    @Override
    boolean doesWin(int number) {
        return number == this.number;
    }

    @Override
    public String toString() {
        return "Straight {" + "number=" + number + ", payout=" + super.payout + '}';
    }
    
    
}
