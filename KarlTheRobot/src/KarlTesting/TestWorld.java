package KarlTesting;
import kareltherobot.*;
public class TestWorld {
    public static void main
            (String[] args)
    {
        World.setSize(10,10);
        World.readWorld("world1.txt");
        World.setVisible(true);
        //new WorldBuilder(true);
        UrRobot amy
                = new
                UrRobot(5,2,
                Directions.East,
                3);
        amy.move(); amy.move();
        amy.turnLeft(); amy.putBeeper();
        amy.move(); // amy.pickBeeper();
    }
}
// SAVE: "world1.txt"