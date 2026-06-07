public class Bitwise {
    public static void OddOREven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.print("Even No");
        } else {
            System.out.print("Odd No");
        }
    }

    public static int getithbit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearithbit(int n, int i) {
        int bitMask = ~(1 << i);

        return (n & bitMask);
    }

    public static int updateithbit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearithbit(n, i);
        } else {
            return setithbit(n, i);
        }
    }

    public static int clearLastibits(int n, int i) {
        int bitMask = (-1) << i;
        return n & bitMask;
    }

    public static int clearbitinRange(int n, int i, int j) {
        int a = (-1) << (j + 1);
        int b = (i << i) - 1;
        return n & (a | b);
    }

    public static boolean powof2ornot(int n) {
        if ((n & n - 1) == 0) {
            return true;
        }
        return false;
    }

    public static int countSETbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = (n >> 1);

        }
        return count;
    }

    public static int fastexpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a *= a;
            n = n >> 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        // OddOREven(6);
        // System.out.println(getithbit(5, 2));
        System.out.println(setithbit(10, 2));
        // System.out.println(clearithbit(10, 1));
        System.out.println(updateithbit(10, 1, 0));
        System.out.println(clearLastibits(11, 2));
        System.out.println(clearbitinRange(15, 1, 2));
        System.out.println(powof2ornot(19));
        System.out.println(countSETbits(10));
        System.out.println(fastexpo(8, 8));
        int x = 5;
        int y = 6;
        // //Ques1
        // System.out.print("x" + " " + "+" + " " + 1 + "= " + -~x);
        // Ques-2
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.print("x: " + x + " y: " + y);
        // Ques-4
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | (1 << 5)));
        }
        System.out.println();
        System.out.print(((-1) << 3));
    }
}
