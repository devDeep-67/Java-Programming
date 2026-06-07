import java.util.*;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int LargestElement(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        /* Linear Search */
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // System.out.print("Enter the number to be searched: ");
        // int key = sc.nextInt();
        // int index = linearSearch(numbers, key);
        // if (index == -1) {
        // System.out.println("Number not found");
        // } else {
        // System.out.println("Number found at index: " + index);
        // }

        /* Largest Element */
        System.out.println("Largest Element is: " + LargestElement(numbers));
        sc.close();
    }
}
