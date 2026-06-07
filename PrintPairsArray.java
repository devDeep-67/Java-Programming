import java.util.*;

public class PrintPairsArray {
    public static void printPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")" + " ");
            }
            System.out.println();
        }
    }

    public static void printSub(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int arr[] = { 7, 8, 9, 10 };
        printPairs(arr);
        printSub(arr);

        // printSub(arr);
        Sc.close();
    }

}
