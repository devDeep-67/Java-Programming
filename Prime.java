import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = Sc.nextInt();

        if (n == 2) {
            System.out.print("Given no is Prime ");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.print("Given no is a Prime No. ");
            } else {
                System.out.print("Given no is not Prime");
            }
        }
        Sc.close();

    }

}
