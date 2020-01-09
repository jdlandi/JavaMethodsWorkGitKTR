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
}
