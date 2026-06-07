import java.util.*;

public class Strings {
    public static void printStr(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String fname = Sc.next();
        System.out.println("Enter Last Name: ");
        String lname = Sc.next();
        String Name = fname + " " + lname;
        printStr(Name);

        Sc.close();
        ;
    }
}
