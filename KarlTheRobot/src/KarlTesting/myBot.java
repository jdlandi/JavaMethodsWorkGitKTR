package KarlTesting;
import kareltherobot.*;
import java.awt.*;

public class myBot extends UrRobot {

    public myBot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }
    public void nDir(Directions dir) {
        while (ddir != dir) {
            super.turnLeft();
        }

    }
}