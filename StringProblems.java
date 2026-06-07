public class StringProblems {
    public static boolean isPalindrome(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            int n = name.length();
            if (name.charAt(i) != name.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static float getshortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        float dis = (float) Math.sqrt(x * x + y * y);
        return dis;

    }

    public static String SubString(String name, int si, int ei) {
        String SubString = " ";
        for (int i = si; i < ei; i++) {
            SubString += name.charAt(i);
        }
        return SubString;
    }

    public static void main(String[] args) {
        // String name = "WNEENESENNN";
        // System.out.print(getshortestPath(name));
        // String name = "Deep Pawar";
        // System.out.print(SubString(name, 2, 7));
        String[] fruits = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.print(largest);
    }

}
