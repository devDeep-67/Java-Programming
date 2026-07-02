import java.util.LinkedList;
import java.util.Queue;

public class Stack2Queue {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push operation
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();

                    if (q1.isEmpty()) {
                        break; // Last element found
                    }

                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    if (q2.isEmpty()) {
                        break; // Last element found
                    }

                    q1.add(top);
                }
            }

            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);

                    if (q1.isEmpty()) {
                        break; // Last element
                    }
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);

                    if (q2.isEmpty()) {
                        break; // Last element
                    }
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {

        Stack s1 = new Stack();

        s1.push(0);
        s1.push(5);
        s1.push(2);
        s1.push(7);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}