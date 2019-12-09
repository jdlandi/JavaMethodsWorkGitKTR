package KarlTesting;
import kareltherobot.*;
public class TestWorld {
    private static class myBot extends UrRobot {
        private myBot(int street, int avenue, Direction direction, int beepers) {
            super(street, avenue, direction, beepers);
        }

        private void turnRight() {
            turnLeft();
            turnLeft();
            turnLeft();
        }
    }
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
        myBot ken = new myBot(5,2,Directions.East,2);
        ken.turnRight();

    }
}
// SAVE: "world1.txt"