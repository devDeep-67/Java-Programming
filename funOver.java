public class funOver {
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("The sum of two integers: " + add(5, 10));
        System.out.println("The sum of two floats: " + add(5.5f, 10.5f));

    }

}
