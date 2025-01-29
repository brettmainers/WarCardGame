import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Card> main = new LinkedList<>();
        LinkedList<Card> deck1 = new LinkedList<>();
        LinkedList<Card> deck2 = new LinkedList<>();

        
        Deck.createDeck(main);
        Deck.shuffleDeck(main);
        System.out.println(main);
        System.out.println(main.size());
        System.out.println("-------------------------------------------------------");
        Deck.dealDeck(main, deck1, deck2);
        System.out.println(deck1);
        System.out.println("-------------------------------------------------------");
        System.out.println(deck2);
        System.out.println("-------------------------------------------------------");
        Play.playWar(deck1, deck2);
    }
}