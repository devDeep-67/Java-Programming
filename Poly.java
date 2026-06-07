public class Poly {
    public static void main(String[] args) {
        // Calculator C1 = new Calculator();
        // System.out.println(C1.sum(8, 9));
        // System.out.print(C1.sum(3.14f, 9.8f));
        Deer D1 = new Deer();
        D1.eat();

    }
}

// function overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }
}

// method overriding
class Animal {
    void eat() {
        System.out.print("eats");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.print("Eats Grass");
    }
}