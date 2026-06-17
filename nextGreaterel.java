import java.util.*;

public class nextGreaterel {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGEle[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1-while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();

            }
            // if else
            if (s.isEmpty()) {
                nextGEle[i] = -1;
            } else {
                nextGEle[i] = arr[s.peek()];
            }
            // 3-push
            s.push(i);
        }
        for (int i = 0; i < nextGEle.length; i++) {
            System.out.print(nextGEle[i] + " ");
        }
        // next greaer left /right
        // next smaller right/left

    }

}
