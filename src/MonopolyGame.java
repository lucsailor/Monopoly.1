import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class MonopolyGame {
    static String stringPlayerCount = "0";
    static int playerCount = 0;
    static String playerName;
    static Player[] players;
    public static int j = 0;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player("Luca");
        Street_initial.streetInitial();
        stringPlayerCount = JOptionPane.showInputDialog("Wie viele Spieler?");
        playerCount = Integer.parseInt(stringPlayerCount);
        players = new Player[playerCount];
        Random rand = new Random();
        j = rand.nextInt(playerCount);
        for (int i = 0; i < playerCount; i++){
            playerName = JOptionPane.showInputDialog("Geben Sie den Namen für Spieler " + (i+1) + " ein:");
            players[i] = new Player(playerName);
            System.out.println(players[i].name);
        }
        JFrame frame = new JFrame("Mein Button");
        JButton button = new JButton("Würfeln");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                player1.rollDice();
                System.out.println(player1.resultDice);
                System.out.println(Player.Streets[player1.position].name);
            }
            });

            frame.getContentPane().add(button);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

    }

}
