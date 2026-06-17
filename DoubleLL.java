import org.w3c.dom.Node;

public class DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newnNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnNode;
            return;
        }
        newnNode.next = head;
        head.prev = newnNode;
        head = newnNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode; // Important!
    }

    public void Display() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("Dll is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;

    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(9);
        dll.addFirst(0);
        dll.addLast(2);
        dll.Display();
        dll.removeFirst();
        dll.Display();

    }

}
