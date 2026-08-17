import java.util.ArrayList;

public class BST_Sorted {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static Node CreateBST(int[] arr, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = CreateBST(arr, st, mid - 1);
        root.right = CreateBST(arr, mid + 1, end);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node CreateBSTAL(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = CreateBSTAL(inorder, st, mid - 1);
        root.right = CreateBSTAL(inorder, mid + 1, end);
        return root;
    }

    public static Node balancedBST(Node root) {
        // Inorder Seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // Inorder seq->Balanced BST
        root = CreateBSTAL(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 5, 6, 8, 10, 11, 12 };
        // Node root = CreateBST(arr, 0, arr.length - 1);
        // PreOrder(root);
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = balancedBST(root);
        PreOrder(root);

    }

}
