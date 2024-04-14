package poker.main;

import poker.dominio.BetType;
import poker.dominio.Deck;
import poker.dominio.Player;
import poker.dominio.PokerTable;

public class Main {

    public static void main(String[] args) {
        Deck poker = new Deck();
        poker.showDeck();
        System.out.println("_________________________________________________");
        poker.shuffle();
        poker.showDeck();
        Player Player1 = new Player("Player-1");
        Player Player2 = new Player("Player-2");

        System.out.println(PokerTable.minBet); // 100
        System.out.println(PokerTable.pot); // 0
        System.out.println("________________");
        Player1.bet(BetType.MATCH);
        System.out.println(PokerTable.minBet); //100
        System.out.println(PokerTable.pot); // 100
        System.out.println("________________");
        Player2.bet(BetType.DOUBLE);
        System.out.println(PokerTable.minBet); // 200
        System.out.println(PokerTable.pot);  // 300
        System.out.println("________________");
        Player1.bet(BetType.DOUBLE);
        System.out.println(PokerTable.minBet); //400
        System.out.println(PokerTable.pot); // 600

    }
}