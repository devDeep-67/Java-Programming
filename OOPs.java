public class OOPs {
    public static void main(String[] args) {
        Pen P1 = new Pen(45, "Red");

        P1.prices[0] = 52;
        P1.prices[1] = 78;
        P1.prices[2] = 89;
        Pen P2 = new Pen(P1);
        P1.prices[1] = 97;

        System.out.println(P1.getColor() + " " + P1.getprice());
        System.out.println(P2.getColor() + " " + P2.getprice());
        for (int i = 0; i < 3; i++) {
            System.out.print(P2.prices[i] + " ");
        }

    }

}

class Pen {
    private int price;
    private String color;
    int[] prices = new int[3];

    // Deep Copy Constructor
    Pen(Pen P1) {
        this.price = P1.price;
        this.color = P1.color;
        for (int i = 0; i < 3; i++) {
            this.prices[i] = P1.prices[i];
        }

    }
    // Shallow Copy Constructor
    // Pen(Pen P1) {
    // this.price = P1.price;
    // this.color = P1.color;
    // this.prices = P1.prices;
    // }

    Pen(int price, String color) {
        this.price = price;
        this.color = color;
        prices = new int[3];
        System.out.println("Constructor is Called");
    }

    String getColor() {
        return this.color;
    }

    int getprice() {
        return this.price;
    }

    // void setVal(int price, String color) {
    // this.price = price;
    // this.color = color;

    // }
}
