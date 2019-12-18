package Connect4;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.GregorianCalendar;

import Connect4.Board;

public class drawFunctions extends JPanel {
    public static Color pieceColor(Piece piece) {
        Color c;
        switch (piece.team) {
            case 'X': c = Color.RED; break;
            case 'O': c = Color.YELLOW; break;
            default: c = Color.WHITE; break;
        }
        return c;
    }
    public static void drawPiece(Graphics g, Piece piece) {
        g.setColor(pieceColor(piece));
        g.fillOval(piece.rX + 5, piece.rY + 5, 90, 90);
    }
    public static void drawPieces(Graphics g, Piece[] pieces) {
        for (Piece curr:pieces) {
            drawPiece(g, curr);
        }
    }
    public static void hoverPiece(Graphics g, int x, int y, char cTeam) {
        drawPiece(g, new Piece(x,y,cTeam));
    }

    public static void waitForClick(Graphics g, Board board, boolean mouseInPanel, int[] mousePos, char cTeam) {
        drawPieces(g, board.set);
        if (mouseInPanel) {
            drawFunctions.hoverPiece(g,mousePos[0],mousePos[1],cTeam);
        }
    }

    public static void waitForStart(Graphics g, int[] mousePos, boolean isKey) {
        if (isKey) {
            Color c = Color.RED
        }
        g.setColor();
        g.drawString("Press START or [SPACE] to begin", 350,300);
    }
}
