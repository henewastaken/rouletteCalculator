
/** 
 * Class for controlling the bets.
 *
 * @author Henry Andersson
 */
class Bets {
    int payout;
    int number;
    int bet;
    int[] numbers;
    
    
    public Bets() {

    }
//    public void setBankroll (int bankroll) {
//        this.bankroll = bankroll;
//    }
    @Override
    public String toString() {
        return "Bets{" + '}';
    }
    // Mitähän mä oon tässä ajatellu. Numbers, what does they mean?!
    boolean doesWin(int number) {
        return 0 == 1;
    }
}