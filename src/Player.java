import java.math.*;
import java.util.ArrayList;
import java.util.Random;
public class Player {
    String name;
    int cash;
    int paschCount;
    int bahnhofCount;
    int werkeCount;
    boolean inPrison;
    int position;
    public static Street[] Streets = new Street[40];
    public ArrayList<Street> myStreets = new ArrayList<Street>();
    public int resultDice;
    int Gefängnisfreikarte;


    public Player (String name) {
        this.name = name;
        cash = 1500;
        paschCount = 0;
        bahnhofCount = 0;
        werkeCount = 0;
        inPrison = false;
        position = 0;
        Gefängnisfreikarte = 0;
    }

    public void rollDice(){
        Random rand = new Random();
        if (inPrison){
//            if(pay) // Der Spieler zahlt
            //else
            int resultDieOne = rand.nextInt(6) + 1;
            int resultDieTwo = rand.nextInt(6) + 1;
            resultDice = resultDieOne + resultDieTwo;
            if (resultDieOne == resultDieTwo) {
                pasch();
                moveForward();
            } else {
                paschCount++;
                if (paschCount == 3) {
                    cash -= 50;
                    moveForward();
                }
            }
        } else {
            int resultDieOne = rand.nextInt(6) + 1;
            int resultDieTwo = rand.nextInt(6) + 1;
            resultDice = resultDieOne + resultDieTwo;
            if (resultDieOne == resultDieTwo) {
                pasch();
            } else {
                paschCount = 0;
            }
            moveForward();
        }
    }
    public void pasch(){
        paschCount += 1;
        if (paschCount == 3){
            //move to jail
            position = 10;
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
            position += resultDice;
            if(position >= 40){
                position = position % 40;
                cash += 200;
            }
            if(position == 0){
                cash += 200;
            }

    }


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
            werkeCount++;
            myStreets.add(Streets[position]);
        } else if (Streets[position].type.equals("Bahnhof")) {
            bahnhofCount++;
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


