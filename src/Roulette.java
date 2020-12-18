import bets.Bets;
import java.util.ArrayList;

/**
 * Main class
 * @author henea
 */
public class Roulette {

    /**
     * Main method
     * @param args
     */ 
    static ArrayList<Bets> betsList = new ArrayList<>(); // List for all different bets
    static int bankroll = 100;
    public static void main(String[] args) {

        GUI k = new GUI();
        k.setVisible(true);
    }    
    
    /**
     * Method for going trough all bets.
     * Adds the result to a list and calculates the bankroll.
     * @param betsList list of bets player made.
     * @return ArrayList<String> containing the results.
     */
    public static ArrayList goTrough(ArrayList<Bets> betsList) {
        // Iterate trough the list. b = one bet object from list.
        ArrayList<String> results = new ArrayList<>();
        for (Bets b : betsList) {
            // Helper variables to make code more readable.
            int bet = b.bet;
            int payMulti = b.payout;
            int winAmount = bet * b.payout;
            
            bankroll -= bet;
            System.out.println("bet: " + bet);
            System.out.println("bankroll " + bankroll);
            
            if (b.doesWin(1)) {
                System.out.println("Voittaja! " + b);
                bankroll += winAmount;
                System.out.println("Sinulla on: " + bankroll);
                results.add("Voittaja! " + b + "  " + winAmount + " Sinulla on: " + bankroll);
            } else {
                results.add("Hävisit :c " + b);
            }
        }
        return results;
    }
}
