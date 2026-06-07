public class BinaryToDecimal {
    public static int binaryToDecimal(int n) {
        int dec = 0;
        int pow = 2;
        for (int i = 0; n > 0; i++) {
            int lastdigit = n % 10;
            dec = dec + lastdigit * (int) Math.pow(pow, i);
            n = n / 10;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1101));
    }

}
