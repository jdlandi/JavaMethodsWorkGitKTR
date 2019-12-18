package Connect4;

public class Piece {
    int x;
    int y;
    int rX;
    int rY;
    int[] pos;
    char team;
    public void init() {
        rX = x * 100 - 100;
        rY = -y * 100 + 600;
        this.pos = new int[]{x,y};
    }
    public Piece(int a, int b, char c) {
        this.team = c;
        this.x = a;
        this.y = b;
        init();
    }
    public void updatePos(int a, int b) {
        x = a;
        y = b;
        init();
    }
}
