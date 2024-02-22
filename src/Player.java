import java.math.*;
import java.util.Random;
public class Player {
    String name;
    int cash;
    int paschCount;
    int bahnhofCount;
    boolean inPrison;
    int position;
    public static Street[] Streets;

    int resultDice;

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

        }
    }

}
