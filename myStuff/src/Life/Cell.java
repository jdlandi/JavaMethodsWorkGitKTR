package Life;

public class Cell {
    int x; int y;
    int[] pos;
    boolean state;
    int neighbors;

    public Cell(int a, int b, boolean c){
        x = a;
        y = b;
        pos = new int[]{a,b};
        state = c;
    }

    public void die() {
        state = false;
    }

    public void live() {
        state = true;
    }

    public void tick(int neighbors) {
        if (state) {
            if (neighbors < 2) {
                die();
            } else if (neighbors < 4) {
                live();
            } else {
                die();
            }
        } else {
            if (neighbors == 3) {
                live();
            } else {
                die();
            }
        }
    }
}
