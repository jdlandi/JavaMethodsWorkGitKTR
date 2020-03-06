package CW.Sorts;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {

    }
    public static void is(ArrayList<Integer> nums) {
        ArrayList<Integer> sorted = new ArrayList<>();
        sorted.add(nums.get(0));
        nums.remove(1);
        while (!nums.isEmpty()) {
            moveTo(sorted, nums.get(0));
            nums.remove(0);
        }
        for (int i = 0; i < sorted.size(); i++) {
            nums.add(sorted.get(i));
        }

    }

    public static void moveTo(ArrayList<Integer> nums, int n) {
        for (int i = 0; i < nums.size(); i ++) {
            if (n > nums.get(i)) {
                nums.add(i, n);
            }
        }
    }
}
