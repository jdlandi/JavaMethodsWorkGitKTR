package Connect4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Connect4.drawFunctions.*;
import Connect4.Board.*;

// https://docs.oracle.com/javase/tutorial/uiswing/events/eventsandcomponents.html
public class Run extends JPanel implements ActionListener, MouseListener {
    Board cBoard = new Board();
    private int xPos, yPos,xPos2,yPos2;  // hold the coordinates of the message

    // Called automatically after a repaint request
    public void paintComponent(Graphics g)
    {
        Piece one = new Piece(xPos,yPos,'X');
        Piece two = new Piece(xPos2, yPos2, 'O');
        cBoard.addPiece(two);
        super.paintComponent(g); // Paint the background
        drawFunctions.drawPieces(g, cBoard.set);
    }

    // Called automatically when the timer "fires"
    public void actionPerformed(ActionEvent e)
    {
        // Adjust the horizontal position of the message:
        yPos++;  // subtract 1
        xPos2 ++;
        if (yPos > 6)
            yPos = 1;
        if (xPos2 > 7)
            xPos2 = 1;
        repaint();
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Connect 4");

        // Set this window's location and size:
        // upper-left corner at 300, 300; width 300, height 100
        window.setBounds(300, 300, 716, 639);

        //  Create panel, a Banner object, which is a kind of JPanel:
        Run panel = new Run();
        panel.setBackground(Color.CYAN);  // the default color is light gray

        // Add panel to window:
        Container c = window.getContentPane();
        c.add(panel); c.addMouseListener(panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // Set the initial position of the message:
        panel.xPos = 1;
        panel.yPos = 1;
        panel.xPos2 = 1;
        panel.yPos2 = 1;

        // Create a Timer object that fires every 30 milliseconds;
        // attach it to panel so that panel "listens to" and
        // processes the timer events; start the timer:
        Timer clock = new Timer(500, panel);
        clock.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at "+ e.getX() + "," + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Out");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
