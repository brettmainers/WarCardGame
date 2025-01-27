import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Play {

    public static void playWar(LinkedList<Card> deck1, LinkedList<Card> deck2) {
        while (!deck1.isEmpty() || !deck2.isEmpty()) {
            if (deck1.getLast().getValue() > deck2.getLast().getValue()) {
                deck1.addFirst(deck2.removeLast());
                System.out.println("Player 1 (You) wins!");
                System.out.println("Playing next round...");
             } else if (deck1.getLast().getValue() < deck2.getLast().getValue()) {
                deck2.addFirst(deck1.removeLast());
                System.out.println("Player 2 (CPU) wins!");
                System.out.println("Playing next round...");
             } else {
                System.out.println("It's a tie, go to war!");

                List<Card> p1 = new ArrayList<>();
                List<Card> p2 = new ArrayList<>();

                for (int i = 0; i < 3; i++) {
                p1.add(deck1.removeLast());
                p2.add(deck2.removeLast());
             } 
             
                for (int i = 0; i < 3; i++) {
                    
                }
        }

        System.out.println("Game over");

        }
    }
}