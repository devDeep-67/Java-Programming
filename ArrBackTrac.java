public class ArrBackTrac {

    public static void changeArr(int[] arr, int i, int val) {

        // Base case
        if (i == arr.length) {
            System.out.print("Before Backtracking: ");
            printArr(arr);
            System.out.println();
            return;
        }

        // Work
        arr[i] = val;

        // Recursive call
        changeArr(arr, i + 1, val + 1);

        // Backtracking
        arr[i] = arr[i] - 2;

    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.print("Initial Array: ");
        printArr(arr);
        System.out.println();

        changeArr(arr, 0, 1);

        System.out.print("Final Array: ");
        printArr(arr);
    }
}