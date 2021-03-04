import bets.Bets;
import java.util.ArrayList;
import java.util.Random;
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
     * Generate random number between 0 and 37. 37 = 00 on rouletteboard
     * @return int between 0 and 37
     */
    public static int generateNumber() {
        Random r = new Random();
        return (int) r.nextInt(37);
    }
    
    /**
     * Method for going trough all bets.
     * Adds the result to a list and calculates the bankroll.
     * @param betsList list of bets player made.
     * @return ArrayList<String> containing the results.
     */
    public static ArrayList goTrough(ArrayList<Bets> betsList) {
        ArrayList<String> results = new ArrayList<>();
        int ballNumber = generateNumber();

        // Check if generated number is 37, print 00 
        if (ballNumber == 37) {
            results.add("Numero on: 00");
        } else {
            results.add("Numero on: " + Integer.toString(ballNumber));
        }
        
        // Iterate trough the list. b = one bet object from list.
        for (Bets b : betsList) {
            // Helper variables to make code more readable.
            int bet = b.bet;
            int payMulti = b.payout;
            int winAmount = bet * b.payout;
            
            bankroll -= bet;
            System.out.println("bet: " + bet); // For debugging
            System.out.println("bankroll " + bankroll); // For debugging
            
            if (b.doesWin(ballNumber)) {
                System.out.println("Voittaja! " + b); // For debugging
                bankroll += winAmount;
                System.out.println("Sinulla on: " + bankroll); // For debugging
                results.add("Voittaja! " + b + "  " + winAmount + " Sinulla on: " + bankroll);
            } else {
                results.add("Hävisit :c " + b);
            }
        }
        return results;
    }
}
