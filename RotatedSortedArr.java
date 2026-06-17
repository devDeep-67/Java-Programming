public class RotatedSortedArr {
    public static int Search(int[] arr, int target, int si, int ei) {
        if (si > ei) {
            return -1;/// not found
        }
        // kaam'
        int mid = si + (ei - si) / 2;
        // case found
        if (target == arr[mid]) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a left
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, target, si, mid - 1);
            } else { // case b
                return Search(arr, target, mid + 1, ei);
            }
        } else {// arr[mid]<=arr[ei]
                // case c right
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, target, mid + 1, ei);
            } else {
                return Search(arr, target, si, mid - 1);
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;// output->4
        int tarIdx = Search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);

    }

}
