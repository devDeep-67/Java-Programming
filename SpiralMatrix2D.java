public class SpiralMatrix2D {
    public static void printSpiral(int mat[][]) {
        int startrow = 0;
        int endrow = mat.length - 1;
        int startcol = 0;
        int endcol = mat[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // Top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(mat[startrow][j] + " ");
            }
            // Right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(mat[i][endcol] + " ");
            }
            // Bottom
            for (int k = endcol - 1; k >= startcol; k--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(mat[endrow][k] + " ");
            }
            // Left
            for (int l = endrow - 1; l > startrow; l--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(mat[l][startcol] + " ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;

        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printSpiral(mat);
    }
}
