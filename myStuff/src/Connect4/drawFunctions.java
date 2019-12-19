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

    public static void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
        FontMetrics metrics = g.getFontMetrics(font);
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();

        g.setFont(font);
        g.drawString(text, x, y);
    }

    public static void waitForStart(Graphics g, int[] mousePos, boolean isKey, boolean isHS, boolean isHE) {
        Color c = Color.BLACK; int s = 30;
        if (isKey || isHS) {
            c = Color.RED;
            s += 10;
        } else if (isHE) {
            c = Color.BLUE;
            s -= 10;
        }
        g.setColor(c);
        Font playFont = new Font ("ComicSans", Font.BOLD, s);
        Rectangle screen = new Rectangle(0,0,700,600);
        drawCenteredString(g, "Press START or [SPACE] to begin", screen, playFont);
        g.setColor(Color.BLACK); g.draw3DRect(125,400,100,50,true);

    }
}
