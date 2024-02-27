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
    public static int jneu = 0;
    public static boolean gameRunning = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player("Luca");
        Street_initial.streetInitial();
        stringPlayerCount = JOptionPane.showInputDialog("Wie viele Spieler?");
        playerCount = Integer.parseInt(stringPlayerCount);
        players = new Player[playerCount];
        Random rand = new Random();
        System.out.println(rand.nextInt((playerCount)));
        j = rand.nextInt((playerCount));
        jneu = j;
        for (int i = 0; i < playerCount; i++) {
            playerName = JOptionPane.showInputDialog("Geben Sie den Namen für Spieler " + (i + 1) + " ein:");
            players[i] = new Player(playerName);
            System.out.println(players[i].name);
        }
        JFrame frame = new JFrame(players[j].name);
        JButton button = new JButton(players[j].name + " Würfeln");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                players[jneu].rollDice();
                System.out.println(players[jneu].resultDice);
                System.out.println(Player.Streets[players[jneu].position].name);
                if (j >= playerCount) {
                    j = j % playerCount;
                }
                jneu = j;
                button.setText(players[jneu].name + " Würfeln");
            }
        });


        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
