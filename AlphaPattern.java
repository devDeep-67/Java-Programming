public class AlphaPattern {
    public static void main(String[] args) {
        int n = 6;
        /* A-Alphabet Pattern */
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == 1 || i == n / 2 || j == 1 || j == n) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();

        // }

        /* D-Alphabet Pattern */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || (i == 1 && j < n) || (i == n && j < n) || (j == n && i > 1 && i < n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}