package poker.main;

import poker.dominio.card;
import poker.dominio.deck;

public class Main {
    public static void main(String[] args) {
        deck poker = new deck();
        poker.showDeck();
        System.out.println("_________________________________________________");
        poker.shuffle();
        poker.showDeck();
    }
}