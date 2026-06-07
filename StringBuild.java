public class StringBuild {
    public static String toUppercase(String str) {
        StringBuilder Sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        Sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                Sb.append(str.charAt(i));
                i++;
                Sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                Sb.append(str.charAt(i));
            }
        }
        return Sb.toString();

    }

    public static String Compress(String str) {
        String newStr = " ";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static String Compresss(String str) {
        StringBuilder Sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            Sb.append(str.charAt(i));
            if (count > 1) {
                Sb.append(count);
            }
        }
        return Sb.toString();

    }

    public static void main(String[] args) {
        // StringBuilder Sb = new StringBuilder(" ");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // Sb.append(ch);
        // }
        // System.out.print(Sb);
        // String Str = "hey i am deep";
        // System.out.print(toUppercase(Str));
        String Str = "aaabbcd";
        System.out.print(Compresss(Str));
    }

}
