package Connect4;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.lang.Math;

import Connect4.drawFunctions.*;
import Connect4.Board.*;

// https://docs.oracle.com/javase/tutorial/uiswing/events/eventsandcomponents.html
public class Run extends JPanel implements ActionListener, MouseInputListener, KeyListener {
    int gameState = 0; // -1: Quit, 0: Start, 1:Click, 2: Anim, 3: Win
    Board cBoard = new Board();
    char cTeam = 'X';
    int[] mousePos;
    boolean mouseIn = false;
    boolean isKeyPressed = false;
    boolean isHoverStart = false; // Start button beginning
    boolean isHoverExit = false;
    private int xPos, yPos,xPos2,yPos2;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // Paint the background
        switch (gameState) {
            case 0: drawFunctions.waitForStart(g, mousePos,isKeyPressed,isHoverStart, isHoverExit); break;
            case 1: drawFunctions.waitForClick(g,cBoard,mouseIn,mousePos,cTeam); break;
        }
    }

    // Called automatically when the timer "fires"
    public void actionPerformed(ActionEvent e)
    {
        yPos++;
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
        window.setBounds(100, 0, 716, 639);

        //  Create panel, a Banner object, which is a kind of JPanel:
        Run panel = new Run();
        panel.setBackground(Color.CYAN);  // the default color is light gray

        // Add panel to window:
        Container c = window.getContentPane();
        c.add(panel); c.addMouseListener(panel);
        c.addMouseMotionListener(panel);
        c.addKeyListener(panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.isFocusable();

        c.requestFocusInWindow();
        // Set the initial position of the message:
        panel.xPos = 1;
        panel.yPos = 1;
        panel.xPos2 = 1;
        panel.yPos2 = 1;

        // Create a Timer object that fires every 30 milliseconds;
        // attach it to panel so that panel "listens to" and
        // processes the timer events; start the timer:
        Timer clock = new Timer(10, panel);
        clock.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseIn = true;
        mousePos = new int[]{e.getX(),e.getY()};
        System.out.println(Arrays.toString(mousePos));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseIn = true;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseIn = false;
    }

    @Override
    public void mouseDragged(MouseEvent e) { }

    @Override
    public void mouseMoved(MouseEvent e) {
        mousePos = new int[]{Math.round(e.getX() / 100) + 1 ,6 - Math.round(e.getY() / 100)};
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        isKeyPressed = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (gameState) {
            case 0: switch (e.getKeyChar()) {
                case ' ': gameState = 1;
            }
        }
        isKeyPressed = false;
    }
}
