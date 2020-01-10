package Life;



import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.lang.Math;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

public class DrawGame extends JPanel implements ActionListener, MouseListener {
    public void paintComponent(Graphics g) {

    }
    public static void main(String[] args, int[][] seed) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Cells wide?\n");
        int x = scanner.nextInt();
        System.out.println("How many Cells tall?\n");
        int y = scanner.nextInt();
        System.out.println("How big are the cells?\n");
        int size = scanner.nextInt();

        Board game = new Board(x,y,size,seed);

        JFrame window = new JFrame("Game of Life");
        window.setBounds(100, 0, 716, 639);

        DrawGame panel = new DrawGame();
        panel.setBackground(Color.WHITE);

        Container c = window.getContentPane();
        c.add(panel); c.addMouseListener(panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.isFocusable();
        c.requestFocusInWindow();

        Timer clock = new Timer(10, panel);
        clock.start();
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
