import java.util.Scanner;

public class Matrix2D {
    public static boolean search(int Mat[][], int key) {
        int n = Mat.length;
        int m = Mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Mat[i][j] == key) {
                    System.out.print("Element found at : " + i + " " + j + " ");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int Matrix[][] = new int[3][3];
        int n = Matrix.length;
        int m = Matrix[0].length;
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = Sc.nextInt();
            }
        }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(Matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        System.out.print(search(Matrix, 8));
        Sc.close();

    }

}
