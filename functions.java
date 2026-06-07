import java.util.*;

public class functions {
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static int CalculateSum(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int Product(int a, int b) {
        return a * b;
    }

    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int BinomialCoefficient(int n, int r) {
        return Factorial(n) / (Factorial(r) * Factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter n for Binomial Coefficient: " + BinomialCoefficient(num1, num2));
        // int product = Product(num1, num2);
        // int fact = Factorial(num2);
        // System.out.println("Factorial of num2 is: " + fact);
        // System.out.print("Product of num1 & num2 is: " + product);
        // swap(num1, num2);
        // System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        // printHello();
        // int sum = CalculateSum(num1, num2);
        // System.out.println("Sum: " + sum);

        sc.close();
    }

}
