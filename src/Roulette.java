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
        
       
        Käyttöliittymä k = new Käyttöliittymä();
        // Inside bets
        k.setVisible(true);
        
//
//        betsList.add(new Straight(1, 1));
//        betsList.add(new Straight(1, 2));
//        betsList.add(new Split(5, new int[]{1, 2}));
//        betsList.add(new Split(1, new int[]{2, 3}));
//        betsList.add(new Street(2, new int[] {1,2,3}));
//        betsList.add(new Street(1, new int[] {4,5,6}));
//        betsList.add(new Corner(1, new int[] {1, 2, 4, 50}));
//        betsList.add(new Corner(3, new int[] {4, 5, 7, 8}));
//        betsList.add(new Basket(1));
//        betsList.add(new DoubleStreet(1, new int[] {1, 2, 3, 4, 5, 6}));
//        betsList.add(new DoubleStreet(1, new int[] {4, 5, 6, 7, 8, 9}));
//        
//        // Outside bets
//        // 2 to 1
//        betsList.add(new FirstColumn(1));
//        betsList.add(new SecondColumn(1));
//        betsList.add(new ThirdColumn(1));
//        betsList.add(new FirstDozen(1));
//        betsList.add(new SecondDozen(1));
//        betsList.add(new ThirdDozen(1));
//        // 1 to 1
//        betsList.add(new Odd(1));
//        betsList.add(new Even(1));
//        betsList.add(new FirstHalf(1));
//        betsList.add(new SecondHalf(1));
//        betsList.add(new Red(1));
//        betsList.add(new Black(1));
//        
//        // Go trough the bets.
//        goTrough(betsList);
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


/*
   straight = One sumgle number. 35/1
   split = Two adjoining numbers. 17/1
   street = Three horisontal numbers. 11/1
   corner = Four adjoining numbers in a block. 8/1
   basket = 0, 00, 1, 2, 3. 6/1
   doubleStreet = Six numbers from two horizontal rows. 5/1
 */