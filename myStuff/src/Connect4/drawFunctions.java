package Connect4;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

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
}
