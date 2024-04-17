package poker.dominio;

import java.util.ArrayList;

public class Player {
    private final String name;
    private int money = 10000;


    private int currentBet = 0;
    private int toBet = 0;
    public static boolean inGame;

    public static ArrayList<Card> hand = new ArrayList<>(2);

    public void bet(BetType type) {
        switch (type) {
            case MATCH:
                toBet = PokerTable.maxBet - currentBet;
                currentBet = currentBet + toBet;
                inGame = true;
                break;
            case DOUBLE:
                toBet = (PokerTable.maxBet * 2) - currentBet;
                currentBet = currentBet + toBet;
                inGame = true;
                break;
            case ALL_IN:
                toBet = money;
                currentBet = currentBet + toBet;
                inGame = true;
                break;
            case LEAVE:
                inGame = false;
                break;
        }
        PokerTable.maxBet = currentBet;
        PokerTable.pot = PokerTable.pot + toBet;
        money = money - toBet;
    }


    public int getCurrentBet() {
        return currentBet;
    }


    public Player(String playerName) {
        this.name = playerName;
    }

    @Override
    public String toString() {
        return name + " have " + money;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }


}