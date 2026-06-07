public class Sorting2D {
    public static boolean stairSorting(int Mat[][], int key) {
        int row = 0;
        int col = Mat[0].length - 1;
        while (row < Mat.length && col >= 0) {
            if (Mat[row][col] == key) {
                System.out.print("Element found at: " + row + "," + col);
                return true;
            } else if (key > Mat[row][col]) {
                row++;
            } else {
                col--;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int Mat[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }

        };
        System.out.print(stairSorting(Mat, 33));
    }
}
