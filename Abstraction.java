public class Abstraction {
    public static void main(String[] args) {
        // horse h1 = new horse();
        // h1.walk();
        horse h1 = new horse();
        h1.walk();

    }

}

abstract class Animal {
    String Color;

    Animal() {
        Color = "Brown";

    }

    void eat() {
        System.out.print("eats");
    }

    abstract void walk();

}

class horse extends Animal {
    void changecolor() {
        Color = "Dark Brown";
    }

    void walk() {
        System.out.print("Walks with 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.print("Walks with 2 legs");
    }
}

interface chessplayer {
    void moves();
}

class Queen implements chessplayer {
    public void moves() {
        System.out.print("Up,down,Left,Right,Diagnal(in all direction)");
    }
}

class Rook implements chessplayer {
    public void moves() {
        System.out.print("Up,down,Left,Right");
    }
}

class King implements chessplayer {
    public void moves() {
        System.out.print("Up,down,Left,Right,Diagnal(by 1 step)");
    }
}
