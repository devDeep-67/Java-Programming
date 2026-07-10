public class findSubBackTrack {
    public static void finSub(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + " ");

            }
            return;
        }

        // recursion

        // yes
        finSub(str, ans + str.charAt(i), i + 1);

        // no
        finSub(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        finSub(str, "", 0);

    }

}
