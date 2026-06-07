public class Tilling_Problem {
    public static int tilling_Problem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical
        int fnm1 = tilling_Problem(n - 1);
        // Horizontal
        int fnm2 = tilling_Problem(n - 2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.print(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);

        } else {
            map[currchar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currchar), map);

        }
    }

    public static int friends_pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // Single
        int fnm1 = friends_pairing(n - 1);
        // pair
        int fnm2 = friends_pairing(n - 2);
        int pair_ways = (n - 1) * fnm2;
        // total ways
        int total_ways = fnm1 + pair_ways;
        return total_ways;
    }

    public static void binString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // System.out.print(tilling_Problem(3));
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
        // System.out.print(friends_pairing(3));
        binString(3, 0, "");
    }

}
