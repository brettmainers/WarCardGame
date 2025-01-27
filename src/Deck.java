import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    
    public static void createDeck(LinkedList<Card> main1) {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                main1.add(new Card(ranks[j], suits[i], values[j]));
            }
        }
    }

    public static void shuffleDeck(LinkedList<Card> main) {
        List<Card> mainShuffle = new ArrayList<>(main);
        Collections.shuffle(mainShuffle);
        main.clear();
        main.addAll(mainShuffle);
    }

    public static void dealDeck(LinkedList<Card> main, LinkedList<Card> deck1, LinkedList<Card> deck2) {
        while (!main.isEmpty()) {
            deck1.add(main.removeLast());
            deck2.add(main.removeLast());
        }
    }
}