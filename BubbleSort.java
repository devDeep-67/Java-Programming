public class BubbleSort {
    public static void Bubble(int[] nums) {
        int n = nums.length;
        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < n - 1 - turn; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.print("Array is already sorted! ");
                break;
            }
        }

    }

    public static void Selection(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;

                }

            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void Insertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;

            }
            nums[prev + 1] = curr;
        }
    }

    public static void Display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 8, 2, 1 };
        // Bubble(arr);
        Selection(arr);
        Display(arr);

    }

}
