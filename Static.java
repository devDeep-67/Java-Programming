public class Static {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.setValue("Hardik", 241045);
        S1.getValue();

    }

}

class Student {
    String Name;
    int roll_no;
    static String School_Name = "M.B.D International School";

    void setValue(String Name, int roll_no) {
        this.Name = Name;
        this.roll_no = roll_no;
    }

    void getValue() {
        System.out.print("Name: " + Name + " " + "Roll_No: " + roll_no + " " + "School-Name: " + School_Name);
    }
}