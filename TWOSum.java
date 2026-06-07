import java.util.*;

public class TWOSum {
    // Brute force Two Sum
    public static boolean Two_Sum(ArrayList<Integer> list, int Target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == Target) {
                    return true;
                }
            }
        }
        return false;

    }

    // Optimized way
    public static boolean Two__Sum(ArrayList<Integer> list, int Target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if (list.get(rp) + list.get(lp) == Target) {
                return true;
            }
            if (list.get(rp) + list.get(lp) < Target) {
                lp++;
            } else {
                rp--;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.print(Two__Sum(list, 5));

    }

}