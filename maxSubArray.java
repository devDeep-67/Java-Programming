import java.util.*;

public class maxSubArray {
    public static void maxSub(int[] num) {
        int Max_Sum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {

            for (int j = i; j < num.length; j++) {
                int CurrSum = 0;
                for (int k = i; k <= j; k++) {
                    CurrSum += num[k];

                }
                System.out.println(CurrSum);
                if (CurrSum > Max_Sum) {
                    Max_Sum = CurrSum;
                }

            }
        }
        System.out.print("Max_Sum" + Max_Sum);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int arr[] = { 7, 8, 9, 10 };
        maxSub(arr);

        Sc.close();
    }

}
