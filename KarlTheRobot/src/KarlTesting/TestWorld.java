package KarlTesting;
import kareltherobot.*;
import KarlTesting.myBot.*;

public class TestWorld {
    public static void main
            (String[] args)
    {
        World.setSize(10,10);
        World.readWorld("world1.txt");
        World.setVisible(true);
        //new WorldBuilder(true);
        myBot amy
                = new
                myBot(5,2,
                Directions.East,
                3);
        amy.nDir(Directions.West);

    }
}
// SAVE: "world1.txt"