package Connect4;

public class Piece {
    int x;
    int y;
    int[] pos = new int[]{x,y};
    char team;
    public Piece(int a, int b, char c) {
        this.team = c;
        this.x = a;
        this.y = b;
    }
}
