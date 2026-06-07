import java.util.*;

public class ArreyList {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx2);
        list.set(idx2, list.get(idx1));
        list.set(idx1, temp);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(0);
        list.add(9);
        // System.out.println(list);
        // get function
        // System.out.print(list.get(2));
        // remove fxn
        // list.remove(2);
        // set fxn
        // list.set(2, 8);
        // System.out.println(list);
        // System.out.println(list.contains(2));
        // System.out.println(list.size());
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i) + " ");
        // }
        // System.out.println();
        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.print(list.get(i) + " ");

        // // }
        // swap(list, 1, 3);

        // Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println(list);

    }
}