public class Street {
    int position;
    String name;
    public int price;
    int[] rent;
    int[] group;
    int upgrade_cost;
    String type;
    boolean buyable;
    public Player owner;
    static int i = 0;

    public Street (String name, int[] rent, int upgrade_cost, int price, String type, int[] group, boolean buyable){
        this.name = name;
        this.rent = rent;
        this.upgrade_cost = upgrade_cost;
        this.price = price;
        this.type = type;
        this.buyable = buyable;
        position = i;
        Player.Streets[i] = this;
        i++;
    }





}