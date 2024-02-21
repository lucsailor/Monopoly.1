import java.math.*;
public class Player {
    String name;

    int Cash;
    int paschCount;
    int bahnhofCount;
    boolean inPrison;
    int position;
    public static Street[] Streets;

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
}