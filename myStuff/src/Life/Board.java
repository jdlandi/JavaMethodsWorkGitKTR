package Life;

public class Board {
    static int sizeX, sizeY;
    int[] rSize;
    static Cell[] cells = new Cell[sizeX * sizeY];

    public void init() {
        for (int i = 1; i <= sizeX; i ++) {
            for (int j = 1; j <= sizeY; j++) {
                cells[(i - 1) * sizeY + (j - 1)] = new Cell(i, j, false);
            }
        }
    }

    public Board(int x, int y, int block, int[][] seed) {
        sizeX = x; sizeY = y;
        rSize = new int[]{block * x, block * y};
        init();
    }
}
