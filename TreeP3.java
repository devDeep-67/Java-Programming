import java.util.ArrayList;
import java.util.logging.Level;

import org.w3c.dom.Node;

public class TreeP3 {
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

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);
        if (foundleft || foundright) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;

    }

    // Lowest Common Ancesstor[LCA] Approach-1
    public static Node lca1(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        // last comon ancesstor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // last equal node i-1th
        Node lca = path1.get(i);
        return lca;

    }

    // Kth Level of tree
    public static void KLevel(Node root, int lvl, int k) {
        if (root == null) {
            return;
        }
        if (lvl == k) {
            System.out.print(root.data + " ");
            return;
        }
        KLevel(root.left, lvl + 1, k);
        KLevel(root.right, lvl + 1, k);
    }

    // Lowest Common Ancesstor[LCA] Approach-2
    public static Node lca2(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node lLCA = lca2(root.left, n1, n2);
        Node rLCA = lca2(root.right, n1, n2);
        // if lLCA=val rLCA=null
        if (rLCA == null) {
            return lLCA;
        }
        if (lLCA == null) {
            return rLCA;
        }
        return root;

    }

    public static int lcaDis(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDis = lcaDis(root.left, n);
        int rightDis = lcaDis(root.right, n);
        if (leftDis == -1 && rightDis == -1) {
            return -1;
        } else if (leftDis == -1) {
            return rightDis + 1;
        } else {
            return leftDis + 1;
        }

    }

    // Min-Distance between n1 and n2 based problem
    public static int minDis(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDis(lca, n1);
        int dist2 = lcaDis(lca, n2);
        return dist1 + dist2;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // int k = 2;
        // KLevel(root, 1, k);
        // Node lc = lca2(root, 4, 7);
        // System.out.println(lc.data);
        System.out.println(minDis(root, 4, 6));

    }

}