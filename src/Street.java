public class Street {
    String name;
    int price;
    int[] rent;
    int[] group;
    int upgrade_cost;
    String type;
    Player owner;
    static int i = 0;

    public Street (String name, int[] rent, int upgrade_cost, int price, String type, int[] group){
        this.name = name;
        this.rent = rent;
        this.upgrade_cost = upgrade_cost;
        this.price = price;
        this.type = type;
        Player.Streets[i] = this;
        i++;

    }

    public void rollDice(){


    }

}