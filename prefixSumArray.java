import java.util.*;

public class prefixSumArray {
    public static void prefixSum(int[] nums) {
        int CurrSum = 0;
        int Max_Sum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int start = i;

            for (int j = 1; j < nums.length; j++) {
                int end = j;
                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (CurrSum > Max_Sum) {
                    Max_Sum = CurrSum;
                }

            }
        }
        System.out.print("Max Sum is : " + Max_Sum);

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int arr[] = { 7, -2, 8, -3 };
        prefixSum(arr);

        Sc.close();

    }
}
