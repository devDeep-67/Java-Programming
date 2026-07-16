import org.w3c.dom.Node;

public class Tree_Diam {
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

    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh) + 1;

    }

    public static int count_of_Nodes(Node root) {
        if (root == null) {
            return 0;

        }
        int lc = count_of_Nodes(root.left);
        int rc = count_of_Nodes(root.right);
        int count = lc + rc + 1;
        return count;
    }

    // O(n2)
    public static int Diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int lD = Diameter(root.left);
        int lh = Height(root.left);
        int rD = Diameter(root.right);
        int rh = Height(root.right);
        int self_Diam = lh + rh + 1;
        return Math.max(lD, Math.max(rD, self_Diam));
    }

    static class Info {
        int ht;
        int diam;

        public Info(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }

    }

    public static Info ODiameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info L_Info = ODiameter(root.left);
        Info R_Info = ODiameter(root.right);

        int diam = Math.max(Math.max(L_Info.diam, R_Info.diam), L_Info.ht + R_Info.ht + 1);
        int ht = Math.max(L_Info.ht, R_Info.ht) + 1;
        return new Info(ht, diam);

    }

    public static boolean isIdentical(Node node, Node SubRoot) {
        if (node == null && SubRoot == null) {
            return true;
        } else if (node == null || SubRoot == null || node.data != SubRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, SubRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, SubRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubTree(Node root, Node SubRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == SubRoot.data) {
            if (isIdentical(root, SubRoot)) {
                return true;
            }
        }
        return isSubTree(root.left, SubRoot) || isSubTree(root.right, SubRoot);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // System.out.println(ODiameter(root).diam);
        Node SubRoot = new Node(2);
        SubRoot.left = new Node(4);
        SubRoot.right = new Node(5);

    }

}
