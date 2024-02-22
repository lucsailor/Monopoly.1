import java.math.*;
import java.util.ArrayList;
import java.util.Random;
public class Player {
    String name;
    int cash;
    int paschCount;
    int bahnhofCount;
    boolean inPrison;
    int position;
    public static Street[] Streets;
    public ArrayList<Street> myStreets = new ArrayList<Street>();
    int resultDice;
    int Gefängnisfreikarte;

    public void rollDice(){
        Random rand = new Random();
        int resultDieOne = rand.nextInt(6) + 1;
        int resultDieTwo = rand.nextInt(6) + 1;
        resultDice = resultDieOne + resultDieTwo;
        if (resultDieOne == resultDieTwo){
            pasch();
        }
        else {
            paschCount = 0;
        }
        moveForward();
    }
    public void pasch(){
        paschCount += 1;
        if (paschCount == 3){
            //move to jail
            position = 9;
            inPrison = true;
            paschCount = 0;
        }
        //Snake Eye Bonus
        if (resultDice == 2){
            cash += 200;
        }

        //Nicht vergessen: Der Spieler ist nochmal dran danach
    }
    public void moveForward(){
        if(!inPrison) { //Hier würde ich dann die Entscheidung mit dem Pay Fine und so implementieren
            position += resultDice;
            if(position >= 35){
                position = position % 36;
                cash += 200;
            }
            if(position == 0){
                cash += 200;
            }

    }}


    public void buyProperty(int position) {
        if (cash >= Streets[position].price) {
            cash -= Streets[position].price;
            addStreet(position);
        }
    }


    public static void trade(Player player1, int cash1, Street[] streets1, int Gefängnisfreikarte1, Player player2, int cash2, Street[] streets2, int Gefängnisfreikarte2) {

    }

    public void addStreet(int position){
        if (myStreets.isEmpty() || Streets[position].type.equals("Werk")) {
            myStreets.add(Streets[position]);
        } else if (Streets[position].type.equals("Bahnhof")) {
            for (int j = 0; j < myStreets.size(); j++){
                if (myStreets.get(j).type.equals("Werk")){
                    myStreets.add(j, Streets[position]);
                    break;
                }
                if (j == myStreets.size() - 1) {
                    myStreets.add(Streets[position]);
                    break;
                }
            }

        } else {
            for (int i = 0; i < myStreets.size(); i++){
                if (myStreets.get(i).type.equals("Bahnhof") || myStreets.get(i).type.equals("Werk")) {
                    myStreets.add(i, Streets[position]);
                    break;
                }
                if (myStreets.get(i).position < position) {
                    myStreets.add(i, Streets[position]);
                    break;
                }
            }
        }
    }
}


