package Life;

public class Board {
    static int sizeX, sizeY;
    int[] rSize;
    static Cell[] cells;

    public void init(int[][] seed) {
        for (int i = 1; i <= sizeX; i ++) {
            for (int j = 1; j <= sizeY; j++) {
                cells[(i - 1) * sizeY + (j - 1)] = new Cell(i, j, false);
            }
        }
        for (int i = 0; i < seed.length; i++) {
            makeLive(seed[i]);
        }
    }

    public Board(int x, int y, int block, int[][] seed) {
        sizeX = x; sizeY = y;
        rSize = new int[]{block * x, block * y};
        cells = new Cell[sizeX * sizeY];
        init(seed);
    }

    public Cell findCell(int[] findee) {
        for (int i = 1; i <= sizeX; i ++) {
            for (int j = 1; j <= sizeY; j++) {
                if (cells[(i - 1) * sizeY + (j - 1)].pos == findee) {
                    return cells[(i - 1) * sizeY + (j - 1)];
                }
            }
        }
        return new Cell(1,1,true);
    }

    public int findN(int[] cel) {
        int neighbors = 0;
        int[][] nDistance = new int[][]{{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
        for (int i = 0; i < nDistance.length; i ++ ) {
            nDistance[i][0] += cel[0]; nDistance[i][1] += cel[1];
            if (findCell(nDistance[i]).state) {
                neighbors += 1;
            }
        }
        return neighbors;
    }

    public void tock() {
        for (int i = 1; i <= sizeX; i ++) {
            for (int j = 1; j <= sizeY; j++) {
                cells[(i - 1) * sizeY + (j - 1)].tick(findN(cells[(i - 1) * sizeY + (j - 1)].pos));
            }
        }
    }

    public void makeLive(int[] lucky) {
        for (int i = 1; i <= sizeX; i ++) {
            for (int j = 1; j <= sizeY; j++) {
                if (cells[(i - 1) * sizeY + (j - 1)].pos == lucky){
                    cells[(i - 1) * sizeY + (j - 1)].live();
                }
            }
        }
    }
}
