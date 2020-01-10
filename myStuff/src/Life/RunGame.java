package Life;
import java.util.*;

public class RunGame {
    static int[][] seed = new int[][]{{1,1},{1,2}};

    public static void main(String[] args) {
        Board lol = new Board(5,5,10,seed);
        DrawGame.main(new String[]{"lol", "boomer"}, new int[][]{{3,5},{4,5},{2,5}});
    }
}
