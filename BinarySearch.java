import java.util.*;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // /* Binary Search */
        // System.out.print("Enter the number to be searched: ");
        // int key = sc.nextInt();
        // int index = binarySearch(numbers, key);
        // if (index == -1) {
        // System.out.println("Number not found");
        // } else {
        // System.out.println("Number found at index: " + index);
        // }
        /* Reverse Array */
        int arr[] = { 2, 4, 6, 8, 10 };
        reverseArray(arr);
        System.out.println("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }

}
