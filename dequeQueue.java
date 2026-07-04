import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class dequeQueue {
    static class Queue {
        Deque<Integer> q = new LinkedList<>();

        // add
        public void add(int data) {
            q.addLast(data);
        }

        // remove
        public int remove() {
            return q.removeFirst();
        }

        // peek
        public int peek() {
            return q.getFirst();
        }

    }

    static class Stack {
        Deque<Integer> d = new LinkedList<>();

        public void push(int data) {
            d.addLast(data);
        }

        public int pop() {
            return d.removeLast();
        }

        public int peek() {
            return d.getLast();
        }
    }

    public static void main(String[] args) {
        // Deque<Integer> deque = new LinkedList<>();
        // deque.addFirst(6);
        // deque.addFirst(7);
        // deque.addLast(8);
        // deque.addLast(5);
        // System.out.println(deque);
        // deque.removeLast();
        // System.out.println(deque);
        // System.out.println("First Element: " + deque.getFirst());
        // System.out.println("Last Element : " + deque.getLast());

        // Problem 1
        // Stack s = new Stack();

        // s.push(10);
        // s.push(20);
        // s.push(30);

        // System.out.println(s.peek()); // 30
        // System.out.println(s.pop()); // 30
        // Problem 2
        Queue q = new Queue();
        q.add(0);
        q.add(2);
        q.add(5);
        System.out.println(q.peek());

    }
}