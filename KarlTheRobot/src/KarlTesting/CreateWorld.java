package KarlTesting;
import java.util.Scanner;
import kareltherobot.*;
public class CreateWorld {
    public static void main
            (String[] args) {
        World.setSize(10, 10);
        World.setVisible(true);
        new WorldBuilder(true);
        
    }
}
