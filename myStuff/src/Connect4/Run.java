package Connect4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Connect4.drawFunctions.*;

// https://docs.oracle.com/javase/tutorial/uiswing/events/eventsandcomponents.html
public class Run extends JPanel implements ActionListener {
    private int xPos, yPos;  // hold the coordinates of the message

    // Called automatically after a repaint request
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // Paint the background
        Piece testP = new Piece(xPos,yPos,'X');
        drawFunctions.drawPiece(g, testP);
    }

    // Called automatically when the timer "fires"
    public void actionPerformed(ActionEvent e)
    {
        // Adjust the horizontal position of the message:
        xPos++;  // subtract 1
        if (xPos > 8)
            xPos = 1;
        repaint();
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Action Demo");

        // Set this window's location and size:
        // upper-left corner at 300, 300; width 300, height 100
        window.setBounds(300, 300, 700, 600);

        //  Create panel, a Banner object, which is a kind of JPanel:
        Run panel = new Run();
        panel.setBackground(Color.WHITE);  // the default color is light gray

        // Add panel to window:
        Container c = window.getContentPane();
        c.add(panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // Set the initial position of the message:
        panel.xPos = 1;
        panel.yPos = 2;

        // Create a Timer object that fires every 30 milliseconds;
        // attach it to panel so that panel "listens to" and
        // processes the timer events; start the timer:
        Timer clock = new Timer(500, panel);
        clock.start();
    }
}
