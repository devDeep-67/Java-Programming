
import java.util.*;

class Pen {
    String name;
    int tip;

    Pen(String name, int tip) {
        this.name = name;
        this.tip = tip;
    }

    void get_innfo() {
        System.out.print(name + " " + tip);
    }

}

public class Basic {
    public static boolean StairSorting(int mat[][], int key) {
        int row = 0;
        int col = mat[0].length - 1;
        while (col >= 0 && row < mat.length) {
            if (mat[row][col] == key) {
                System.out.print("Element found at: " + row + " " + col);
                return true;

            } else if (key < mat[row][col]) {
                col--;
            } else {
                row++;
            }

        }
        return false;
    }

    public static void printSpiral(int[][] arr) {
        int startrow = 0;
        int endrow = arr.length - 1;
        int startcol = 0;
        int endcol = arr[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // Top
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(arr[startrow][i] + " ");
            }
            // Right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            // Bottom
            for (int i = endcol - 1; i >= startcol; i--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][i] + " ");
            }
            // left
            for (int i = endrow - 1; i > startrow; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(arr[i][startcol] + " ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;

        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
        // 15, 16 } };
        // printSpiral(mat);
        // int mat[][] = {
        // { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 27, 29, 37, 48 },
        // { 32, 33, 39, 50 }
        // };
        // System.out.print(StairSorting(mat, 29));
        // String S1, S2;
        // S1 = "Deep";
        // S2 = "Deep Pawar";
        // System.out.print(S2.compareTo(S1));
        Pen P1 = new Pen("Doms", 3);
        P1.get_innfo();
        Sc.close();
    }

}
