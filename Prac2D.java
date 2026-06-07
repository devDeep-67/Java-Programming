public class Prac2D {
    public static void printM(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Problem-1
        // int arr[][] = {
        // { 4, 7, 8 },
        // { 8, 8, 7 }
        // };
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (arr[i][j] == 7) {
        // count++;
        // }

        // }
        // }
        // System.out.print("Count of 7 : " + count);

        // Problem-2
        // int[][] arr = {
        // { 1, 4, 9 },
        // { 11, 4, 3 },
        // { 2, 2, 3 }
        // };
        // int sum = 0;
        // for (int i = 0; i < arr[0].length; i++) {
        // sum += arr[1][i];
        // }
        // System.out.print("Sum: " + sum);
        int[][] Mat = {
                { 3, 4, 5 },
                { 13, 7, 2 },
                { 1, 0, 5 }
        };
        printM(Mat);
        System.out.println();
        int row = Mat.length;
        int col = Mat[0].length;
        int TransposeMatrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                TransposeMatrix[i][j] = Mat[j][i];
            }
        }
        printM(TransposeMatrix);
        System.out.println();
    }
}
