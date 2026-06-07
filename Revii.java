import java.util.*;

public class Revii {
    public static String LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return "Found";
            }
        }
        return "Not Found";
    }

    public static int LargestNo(int arr[]) {
        int max_no = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_no) {
                max_no = arr[i];
            }
        }
        return max_no;
    }

    public static int Binary(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void display_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;

        }
    }

    public static void Pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
            }
            System.out.println();
        }
    }

    public static void printSub(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int max_SubArray_Sum(int[] arr) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                curr = 0;
                for (int i = start; i <= end; i++) {
                    curr += arr[i];
                }
                if (curr > max) {
                    max = curr;
                }
            }
        }
        return max;
    }

    public static int Prefix_Sum(int[] arr) {
        int curr = 0;
        int max_Sum = Integer.MIN_VALUE;
        int[] prefix_arr = new int[arr.length];
        prefix_arr[0] = arr[0];
        for (int i = 1; i < prefix_arr.length; i++) {
            prefix_arr[i] = prefix_arr[i - 1] + arr[i];
        }
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                curr = (start == 0) ? prefix_arr[end] : prefix_arr[end] - prefix_arr[start - 1];
                if (max_Sum < curr) {
                    max_Sum = curr;
                }
            }
        }
        return max_Sum;
    }

    public static int Kadane_s_Sum(int[] arr) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        return ms;
    }

    public static int Trapped_Water(int[] height) {
        int n = height.length;
        // left max bound
        int[] leftmax_bound = new int[n];
        leftmax_bound[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax_bound[i] = Math.max(leftmax_bound[i - 1], height[i]);

        }
        // rightmaxbound
        int[] rightmaxbound = new int[n];
        rightmaxbound[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmaxbound[i] = Math.max(rightmaxbound[i + 1], height[i]);
        }
        // trapped_water
        int trapped_water = 0;
        for (int i = 0; i < n; i++) {
            int Water_Level = Math.min(leftmax_bound[i], rightmaxbound[i]);
            trapped_water += Water_Level - height[i];
        }
        return trapped_water;
    }

    public static int buy_Sell_Stock(int[] price) {
        int b_p = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < price.length; i++) {
            if (b_p < price[i]) {
                int profit = price[i] - b_p;
                max_profit = Math.max(max_profit, profit);
            } else {
                b_p = price[i];
            }

        }
        return max_profit;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter" + i + "," + j + "Element: ");
                arr[i][j] = Sc.nextInt();
                System.out.println();

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        int[] arrrr = { 7, 1, 5, 3, 6, 4 };
        // System.out.print(buy_Sell_Stock(arr));

        Sc.close();
    }
}