public class BackTrack {
    public static void changeArr(int[] arr, int i, int val) {
        // Base case
        if (i == arr.length) {
            Display(arr);
            return;
        }

        // Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findSubSets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("NULL" + " ");

            } else {
                System.out.print(ans + " ");

            }

            return;
        }

        // Yes choice
        findSubSets(str, ans + str.charAt(i), i + 1);
        // No Choice
        findSubSets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        // changeArr(arr, 0, 1);
        // Display(arr);
        String str = "abc";
        findSubSets(str, "", 0);

    }

}
