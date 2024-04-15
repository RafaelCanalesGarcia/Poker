package poker.dominio;

import poker.main.Main;

public class Player {
    private String name;
    private int money = 10000;

    private int currentBet;
    private int toBet = 0;

    public void bet(BetType type) {
        switch (type) {
            case MATCH:
                toBet = PokerTable.maxBet - currentBet;
                currentBet = currentBet + toBet;
                break;
            case DOUBLE:
                toBet = (PokerTable.maxBet * 2) - currentBet;
                currentBet = currentBet + toBet;
                break;
            case ALL_IN:
                toBet = money;
                currentBet = currentBet + toBet;
                break;
            default:
                currentBet = 0;
        }
        PokerTable.maxBet = currentBet;
        PokerTable.pot = PokerTable.pot + toBet;
        money = money - toBet;
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
