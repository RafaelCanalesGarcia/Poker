package poker.dominio;

public class person {
    private String name;
    private int money;
    public person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }

}
