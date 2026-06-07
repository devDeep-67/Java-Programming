//Problem-1
// public class Solution {
//     public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
//         int m = arr1.length;
//         int n = arr2.length;
//         int i = 0;
//         int j = 0;
//         int k = 0;
//         int[] newarr = new int[m + n];
//         // Compare and merge
//         while (i < m && j < n) {
//             if (arr1[i] <= arr2[j]) {
//                 newarr[k] = arr1[i];
//                 i++;

//             } else {
//                 newarr[k] = arr2[j];
//                 j++;
//             }
//             k++;
//         }
//         // Copy remaining of arr1
//         while (i < m) {
//             newarr[k] = arr1[i];
//             i++;
//             k++;
//         }
//         // Copy remaining of arr2
//         while (j < n) {
//             newarr[k] = arr2[j];
//             j++;
//             k++;
//         }
//         int newk = newarr.length;
//         int nm = newk / 2;
//         if (newk % 2 != 0) {
//             return (float) newarr[nm];
//         } else {
//             return (double) (newarr[nm] + newarr[nm - 1]) / 2.0f;

//         }
//     }

//     public static void main(String[] args) {
//         int nums1[] = { 1, 3 };
//         int nums2[] = { 2 };
//         System.out.print(findMedianSortedArrays(nums1, nums2));

//     }
// }

//Problem -2
public class Solution {
    public static int reverse(int x) {
        int rev = 0;
        while (x > 0) {

            int lastd = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + lastd;

        }
        return rev;

    }

    public static void main(String[] args) {
        int x = 123;
        System.out.print(reverse(x));
    }
}