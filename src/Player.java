import java.math.*;
import java.util.ArrayList;

public class Player {
    String name;
    int Cash;
    int paschCount;
    int bahnhofCount;
    boolean inPrison;
    int position;
    public static Street[] Streets = new Street[35];
    public ArrayList<Street> myStreets = new ArrayList<Street>();

    public void rollDice(){
        int resultDieOne = (int) (Math.random() * 6) + 1;
        int resultDieTwo = (int) (Math.random() * 6) + 1;
        int resultDice = resultDieOne + resultDieTwo;
        if (resultDieOne == resultDieTwo){

            paschCount += 1;
            if (paschCount == 3){
                //move to jail
                position = 9;
                inPrison = true;
                paschCount = 0; //Ist das nötig?
                //Beende die Methode, damit der Spieler nicht voranschreitet
                return;

            }
            //Hier muss noch die Funktion hin, dass der Spieler nochmal würfelt
        }
        position += resultDice;
        paschCount = 0; //s.O.

    }

    public void buyProperty(int position) {
        if (Cash >= Streets[position].price) {
            Cash -= Streets[position].price;
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
}