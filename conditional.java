import java.util.*;

public class conditional {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int a = Sc.nextInt();
        int b = Sc.nextInt();
        char op = Sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println((float) a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Cannot have that operator");
        }

        Sc.close();
    }
}
