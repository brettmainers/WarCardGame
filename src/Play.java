import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Play {

    public static void playWar(LinkedList<Card> deck1, LinkedList<Card> deck2) {
        while (!deck1.isEmpty() && !deck2.isEmpty()) {
            if (deck1.getLast().getValue() > deck2.getLast().getValue()) {
                System.out.println("Player 1 plays: " + deck1.getLast().toString());
                System.out.println("Player 2 plays: " + deck2.getLast().toString());
                deck1.addFirst(deck2.removeLast());
                System.out.println("Player 1 (You) wins this round!");
                System.out.println("Playing next round...");
             } else if (deck1.getLast().getValue() < deck2.getLast().getValue()) {
                System.out.println("Player 1 plays: " + deck1.getLast().toString());
                System.out.println("Player 2 plays: " + deck2.getLast().toString());
                deck2.addFirst(deck1.removeLast());
                System.out.println("Player 2 (CPU) wins this round!");
                System.out.println("Playing next round...");
             } else {
                System.out.println("It's a tie, go to war!");

                List<Card> p1 = new ArrayList<>();
                List<Card> p2 = new ArrayList<>();
                
                boolean tie = true; 
                while (tie) {
                    for (int i = 0; i < 4 && !deck1.isEmpty() && !deck2.isEmpty(); i++) {
                        p1.add(deck1.removeLast());
                        p2.add(deck2.removeLast());
                    } 
                    if (p1.getLast().getValue() > p2.getLast().getValue()) {
                        System.out.println("You play 3 cards and flip over the 4th. It is a " + p1.getLast().toString());
                        System.out.println("Player 2 does the same and flips over a " + p2.getLast().toString());
                        deck1.addAll(0,p1);
                        deck1.addAll(0,p2);
                        System.out.println("You win this war and collect all of the cards played!");
                        tie = false;
                    } else if (p1.getLast().getValue() < p2.getLast().getValue()) {
                        System.out.println("You play 3 cards and flip over the 4th. It is a " + p1.getLast().toString());
                        System.out.println("Player 6 plays: " + p2.getLast().toString());
                        System.out.println("Player 2 (CPU) wins this war!");
                        deck2.addAll(0,p1);
                        deck2.addAll(0,p2);
                        tie = false;
                    } else if (p1.getLast().getValue() == p2.getLast().getValue()) {
                        System.out.println("Player 7 plays: " + p1.getLast().toString());
                        System.out.println("Player 8 plays: " + p2.getLast().toString());
                        System.out.println("Another tie! Go to war again!");
                        if (deck1.isEmpty() || deck2.isEmpty()) {
                            tie = false;
                        }
                    }
                }
            }
        }
        if (deck1.isEmpty()) {
            System.out.println("Player 1 has run out of cards.");
            System.out.println("Game over, Player 2 wins!");
        } else if (deck2.isEmpty()) {
            System.out.println("Player 2 has run out of cards.");
            System.out.println("Game over, you win!");
        }

    }
}