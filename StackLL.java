import java.util.Stack;

import org.w3c.dom.Node;

public class StackLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int size;

    static class Stack {
        static Node head;

        // isempty
        public static boolean isEmppty() {
            return head == null;
        }

        // Push
        public static void Push(int data) {
            Node newNode = new Node(data);
            size++;
            if (isEmppty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        public static int pop() {
            if (isEmppty()) {
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek() {
            if (isEmppty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        while (!s.isEmppty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }

}
