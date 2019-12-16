package Connect4;

import java.util.*;

public class board {
    Piece[] pieces;
    Piece[] set = new Piece[42];
    public void init() {
        for (int i = 1; i <= 6; i ++ ) {
            for (int j = 1; j <= 7; j ++) {
                set[((j - 1) + ((i - 1) * 7))] = new Piece(i,j,'-');
            }
        }
    }
    public void addPiece(Piece piece, char team) {
        for (int i = 1; i <= 6; i ++ ) {
            for (int j = 1; j <= 7; j ++) {
                if (Arrays.equals( set[((j - 1) + ((i - 1) * 7))].pos, piece.pos)) {
                    set[((j - 1) + ((i - 1) * 7))] = new Piece(piece.x,piece.y,team);
                };
            }
        }
    }
}
