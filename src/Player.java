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
    int platzhalter = 0;
    Random rand = new Random();

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
        MonopolyGame.j++;

        if (inPrison){
            //Button
            //pay

            if (platzhalter == 10 ){
                cash -= 50;
                this.inPrison = false;
                rollDice();
            }
            // if Gefängnisfreikarte = 0 → nicht ausführen
            else if (platzhalter == 20 ){
                this.Gefängnisfreikarte -= 1;
                this.inPrison = false;
                rollDice();
            }
            else{
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
        MonopolyGame.j--;
        paschCount += 1;
        if (paschCount == 3){
            //move to jail
            position = 10;
            inPrison = true;
            paschCount = 0;
            MonopolyGame.j++;
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
        Streets[position].owner = this;
    }
    public void action(int position){

        switch(Streets[position].type) {
            case "Street":
                steppedOnStreet(position);
                break;
            case "Start":
                cash +=200;
                break;
            case "Gemeinschaftsfeld":
                steppedOnGemeinschaftsfeld();
                break;
            case "Bahnhof":
                steppedOnBahnhof();
                break;
            case "Ereignisfeld":
                steppedOnEreignisfeld();
                break;
            case "Einkommenssteuer":
                cash -=200;
                break;
            case "Gefängnis":
                System.out.println("You're only here for a visit");
                break;
            case "Werk":
                steppedOnWerk();
                break;
            case "Frei Parken":
                //cash += jackpot;
                System.out.println("You've won the jackpot!");
                break;
            case "Ins Gefängnis":
                this.position = 10;
                this.inPrison = true;
                System.out.println("You're going to jail");
                break;
            case "Zusatzsteuer":
                cash -=100;
                break;
            default:


                }
            }


    public void steppedOnStreet(int position) {
        if (Streets[position].owner == null) {
            if (cash >= Streets[position].price) {
                //kaufen button
                if (platzhalter == 1) {
                    cash -= Streets[position].price;
                    addStreet(this.position);
                }
            }
        }
        if (!Streets[position].owner.equals(name)){
            cash -= Streets[position].rent[platzhalter];
            //hier muss noch das übertragen an den Owner hin
        }
        //finish turn knopf
        if (platzhalter == 2){
            //j++ ? Hier müssen wir mal gucken, wie wirs machen
        }
    }
    public void steppedOnGemeinschaftsfeld(){
        int karte = rand.nextInt(50);
        //implementierung Gemeinschaftsfeld
    }
    public void steppedOnBahnhof(){
        if (Streets[position].owner == null) {
            if (cash >= Streets[position].price) {
                //kaufen button
                if (platzhalter == 1) {
                    cash -= Streets[position].price;
                    addStreet(this.position);
                }
            }
        }
        if (!Streets[position].owner.equals(name)){
            cash -= Streets[position].rent[platzhalter];
            //hier muss noch das übertragen des Geldes an den Owner hin
        }

    }
    public void steppedOnEreignisfeld(){
        int karte = rand.nextInt(50);
        //implementierung Ereignisfeld
    }
    public void steppedOnWerk(){
        if (Streets[position].owner == null) {
            if (cash >= Streets[position].price) {
                //kaufen button
                if (platzhalter == 1) {
                    cash -= Streets[position].price;
                    addStreet(this.position);
                }
            }
        }
        if (!Streets[position].owner.equals(name)){
            cash -= (Streets[position].rent[platzhalter]) * resultDice;
            //hier muss noch das übertragen des Geldes an den Owner hin
        }
}
}


