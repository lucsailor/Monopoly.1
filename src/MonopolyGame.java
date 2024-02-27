import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MonopolyGame {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player("Luca");
        Street_initial.streetInitial();
        JFrame frame = new JFrame("Mein Button");
        JButton button = new JButton("Würfeln");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                player1.rollDice();
                System.out.println(player1.resultDice);
                System.out.println(player1.position);
                System.out.println(Player.Streets[player1.position].name);
            }
            });

            frame.getContentPane().add(button);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

    }

}
