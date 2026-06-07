public class Recursion {
    public static void printN(int n) {
        if (n == 0) {
            return;
        } else {
            printN(n - 1);
            System.out.print(n + " ");

        }
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            int factNm1 = fact(n - 1);
            int factN = n * factNm1;
            return factN;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fibonacciNm1 = fibonacci(n - 1);
        int fibonacciNm2 = fibonacci(n - 2);
        int fibonacciN = fibonacciNm1 + fibonacciNm2;
        return fibonacciN;
    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            System.out.println("Element found at index: " + i);
            return key;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurence(arr, key, i + 1);
        if (isfound != -1) {
            return isfound;
        }
        if (arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizedpower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpowersqr = optimizedpower(a, n / 2) * optimizedpower(a, n / 2);
        // odd no
        if (n % 2 != 0) {
            halfpowersqr = a * halfpowersqr;
        }
        return halfpowersqr;
    }

    public static void main(String[] args) {
        // int[] arr = { 13, 5, 8, 5, 9 };
        System.out.print(optimizedpower(2, 5));

    }

}
