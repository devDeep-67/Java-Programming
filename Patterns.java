public class Patterns {
    public static void main(String[] args) {
        /*--Star Pattern--*/
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /* --Inverted Star Pattern */
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 4; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /* Half Pyramid */
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        /* Character Pattern */
        // char ch = 'A';
        // for (int i = 1; i <= 4; i++) {
        // for (int chars = 1; chars <= i; chars++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        /* Inverted Half Pattern */
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        /* fLOYD tRIANGLE */
        // int n = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(n + " ");
        // n++;
        // }
        // System.out.println();
        // }

        /* 0-1 Triangle Pattern */
        // int n = 1;

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(n + " ");
        // if (n == 1) {
        // n = 0;
        // } else {
        // n = 1;
        // }
        // }
        // System.out.println();
        // }
        /* Inverted and Rotated half pyramid */
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if (j >= 4 - i + 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        /* Pattern Problem */
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if (j >= i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        /* X Pattern */
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if ((j == i) || (j == 5 - i + 1)) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        /* Hollow Sphere Pattern */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
