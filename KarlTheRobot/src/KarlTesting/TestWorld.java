package KarlTesting;
import kareltherobot.*;
public class TestWorld {
    public static class myBot extends UrRobot {
        public myBot(int street, int avenue, Direction direction, int beepers) {
            super(street, avenue, direction, beepers);
        }

        public void turnRight() {
            super.turnLeft();
            super.turnLeft();
            super.turnLeft();
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