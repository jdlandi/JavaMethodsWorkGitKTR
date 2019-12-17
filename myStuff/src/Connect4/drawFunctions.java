package Connect4;

import javax.swing.*;
import java.awt.*;

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
        for (int i = 0; i <13; i++) {
            g.fillOval(i * 50, 0, 100, 100);
        }
    }
}
