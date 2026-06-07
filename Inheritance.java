public class Inheritance {
    public static void main(String[] args) {
        mammals m1 = new mammals();
        m1.eats();
        birds b1 = new birds();
        b1.eats();
        b1.fly();
        Sparrow S1 = new Sparrow();
        System.out.println(S1.Color);
        Peacock P1 = new Peacock();
        System.out.println(P1.Color);
    }

}

class Animal {
    String Color;

    void eats() {
        System.out.println("Eats");
    }
}

class mammals extends Animal {
    int legs;

    void swim() {
        System.out.println("swims");
    }
}

class birds extends Animal {
    void fly() {
        System.out.println("Birds Flies");
    }
}

class Sparrow extends birds {
    String Color = "Grey";
}

class Peacock extends birds {
    String Color = "Green";
}

// class Dogs extends mammals {
// String name;

// void bark() {
// System.out.println("Dog Barks");
// }
// }