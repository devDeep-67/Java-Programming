import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // int n = 130705;
        // int rev = 0;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // n = n / 10;

        // }
        // System.out.print(rev);
        while (true) {
            System.out.print("Enter a no: ");
            int n = Sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);

        }
        Sc.close();
    }

}
