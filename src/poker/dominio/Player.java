package poker.dominio;

import poker.main.Main;

public class Player {
    private String name;
    private int money = 10000;

    private int currentBet;

    public void bet(BetType type) {
        switch (type) {
            case MATCH:
                currentBet = PokerTable.minBet;
                break;
            case DOUBLE:
                currentBet = (PokerTable.minBet * 2);
                break;
            case ALL_IN:
                currentBet = money;
                break;
            default:
                currentBet = 0;
        }
        PokerTable.minBet = currentBet;
        PokerTable.pot = PokerTable.pot + currentBet;
        money = money - currentBet;
    }


    public int getCurrentBet() {
        return currentBet;
    }


    public Player() {
    }

    public Player(String name) {
        this.name = name;
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
