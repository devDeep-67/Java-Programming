public class DiagonalSum {
    public static int diagonalSum(int Mat[][]) {
        int DSum = 0;
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat[0].length; j++) {
                if (i == j) {
                    DSum += Mat[i][j];
                } else if (i + j == Mat.length - 1) {
                    DSum += Mat[i][j];
                }

            }
        }
        return DSum;

    }

    public static void main(String[] args) {
        int Mat[][] = {
                { 1, 8, 9 },
                { 7, 9, 7 },
                { 2, 0, 1 }
        };
        System.out.print("Diagonal sum: " + diagonalSum(Mat));

    }
}
