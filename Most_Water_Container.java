import java.util.*;

//Brute force
public class Most_Water_Container {
    public static int Most_Water(ArrayList<Integer> ht) {
        int max_Water = 0;
        for (int i = 0; i < ht.size(); i++) {
            for (int j = i + 1; j < ht.size(); j++) {
                int htt = Math.min(ht.get(i), ht.get(j));
                int wd = j - i;
                int curr_Water = htt * wd;
                max_Water = Math.max(max_Water, curr_Water);
            }
        }
        return max_Water;
    }

    // 2Pointer Approach
    public static int most_water(ArrayList<Integer> height) {
        int max_Water = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // Calculate Water ARea
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp - lp;
            int curr_Water = ht * wd;
            max_Water = Math.max(max_Water, curr_Water);
            // Update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }
        return max_Water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ht = new ArrayList<>();
        ht.add(1);
        ht.add(8);
        ht.add(6);
        ht.add(2);
        ht.add(5);
        ht.add(4);
        ht.add(8);
        ht.add(3);
        ht.add(7);
        System.out.print(most_water(ht));
    }

}
