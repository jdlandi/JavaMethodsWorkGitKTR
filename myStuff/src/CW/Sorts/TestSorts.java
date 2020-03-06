package CW.Sorts;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestSorts {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 10; i > 0; i -= 1) {
            test.add(i);
        }
        test.add(-1);
        ArrayList<Integer> test1 = test, test2 = test;

        System.out.println(test1);
        SelectionSort.ss(test1);
        System.out.println(test1);
        System.out.println("-----------------");
        System.out.println(test2);
        InsertionSort.is(test2);
        System.out.println(test2);
    }
}
