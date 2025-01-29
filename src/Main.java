import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Card> main = new LinkedList<>();
        LinkedList<Card> deck1 = new LinkedList<>();
        LinkedList<Card> deck2 = new LinkedList<>();

        Deck.createDeck(main);
        Deck.shuffleDeck(main);
        Deck.dealDeck(main, deck1, deck2);
        Play.playWar(deck1, deck2);
    }
}