package CW.Sorts;

import java.util.ArrayList;

public class SelectionSort {

    public static int[] small(ArrayList<Integer> nums) {
        int smol = nums.get(0);
        int smolAt = 0;
        for (int i = 1; i < nums.size(); i ++) {
            if (nums.get(i) < smol) {
                smol = nums.get(i);
                smolAt = i;
            }
        }
        return new int[]{smol, smolAt};
    }

    public static void ss(ArrayList<Integer> nums) {
        ArrayList<Integer> sorted = new ArrayList<>();
        int[] loc = new int[2];
        while(!nums.isEmpty()) {
            loc = small(nums);
            nums.remove(loc[1]);
            sorted.add(Integer.valueOf(loc[0]));
        }
        for (int i = 0; i < sorted.size(); i++) {
            nums.add(sorted.get(i));
        }
    }
}
