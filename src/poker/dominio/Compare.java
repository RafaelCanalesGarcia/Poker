package Poker.dominio;

import java.util.HashMap;
import java.util.Map;

import static Poker.dominio.PokerTable.tableCards;

public class Compare {
    private boolean highNumber;

    public boolean isHighNumber() {
        return highNumber;
    }

    public void setHighNumber(boolean highNumber) {
        this.highNumber = highNumber;
    }

    private boolean par;
    private boolean doublePar;
    private boolean trio;
    private boolean flush;
    private boolean color;
    private boolean full;
    private boolean poker;

    private boolean colorFlush;
    private boolean royalFlush;

    public boolean isPar() {
        return par;
    }

    public void setPar(boolean par) {
        this.par = par;
    }

    public boolean isDoublePar() {
        return doublePar;
    }

    public void setDoublePar(boolean doublePar) {
        this.doublePar = doublePar;
    }

    public boolean isTrio() {
        return trio;
    }

    public void setTrio(boolean trio) {
        this.trio = trio;
    }

    public boolean isFlush() {
        return flush;
    }

    public void setFlush(boolean flush) {
        this.flush = flush;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isPoker() {
        return poker;
    }

    public void setPoker(boolean poker) {
        this.poker = poker;
    }

    public boolean isColorFlush() {
        return colorFlush;
    }

    public void setColorFlush(boolean colorFlush) {
        this.colorFlush = colorFlush;
    }

    public boolean isRoyalFlush() {
        return royalFlush;
    }

    public void setRoyalFlush(boolean royalFlush) {
        this.royalFlush = royalFlush;
    }

    static Map<String, Integer> handValue = new HashMap<>() {{
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
        put("9", 9);
        put("10", 10);
        put("J", 11);
        put("Q", 12);
        put("K", 13);
        put("A", 14);
    }};
    static Map<String, String> suitValue = new HashMap<>() {{
        put("Hearts", "Hearts");
        put("Spades", "Spades");
        put("Diamonds", "Diamonds");
        put("Clovers", "Clovers");
    }};

    /*public String coincidences() {
        HashMap<String, Integer> characterCounts = new HashMap<>();
        for (Card card : Player.getHand()) {
            String character = card.getCharacter();
            characterCounts.put(character, characterCounts.getOrDefault(character, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : characterCounts.entrySet()) {
            int count = entry.getValue();
            for (Card handCard : Player.hand) {
                String characterHand = handCard.getCharacter();
                for (Card tableCard : tableCards) {
                    String characterTable = tableCard.getCharacter();
                    if (characterHand.equals(characterTable)) {
                        characterCounts.put(characterTable, characterCounts.getOrDefault(characterTable, 0) + 1);
                    }
                }
            }
            if (count == 2) {
                if (isPar()) {
                    setDoublePar(true);
                    setPar(false);
                    return "Tienes doble pareja.";
                } else {
                    setPar(true);
                    return "Tienes pareja.";
                }
            } else if (count == 3) {
                setTrio(true);
                setPar(false);
                setDoublePar(false);
                return "Tienes un trío.";
            }


        }
        return "No hay coincidencias";
    }*/
}
