package bets;

/** 
 * Class for controlling the bets.
 *
 * @author Henry Andersson
 */
public class Bets {
    public int payout;
    public int number;
    public int bet;
    public int[] numbers;
    
    
    public Bets() {

    }

    @Override
    public String toString() {
        return "Bets{" + '}';
    }
    // Mitähän mä oon tässä ajatellu. Numbers, what does they mean?!
    public boolean doesWin(int number) {
        return 0 == 1;
    }
}