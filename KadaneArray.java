import java.util.*;

public class KadaneArray {
    public static void Kadane(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);

        }
        System.out.print("Max Sum: " + ms);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Kadane(arr);

        Sc.close();
    }

}
