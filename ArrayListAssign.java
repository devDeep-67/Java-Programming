import java.util.*;

public class ArrayListAssign {
    // Problem1-Monotone
    public static boolean isMonotonicArrayList(ArrayList<Integer> nums) {
        boolean in = true;
        boolean dec = true;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                dec = false;
            }
            if (nums.get(i) > nums.get(i + 1)) {
                in = false;
            }
        }
        return in || dec;
    }

    public static int most_water(ArrayList<Integer> height) {
        int max_water = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // water Area
            int htt = Math.min(height.get(rp), height.get(lp));
            int wid = rp - lp;
            int currwater = htt * wid;
            max_water = Math.max(max_water, currwater);
            // update pointers
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }
        return max_water;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(8);
        nums.add(6);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        nums.add(8);
        nums.add(3);
        nums.add(7);

        System.out.print(most_water(nums));

    }
}
