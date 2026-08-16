import java.util.*;

import org.w3c.dom.Node;

public class BST {
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

    public static Node Insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // Left subtree
            root.left = Insert(root.left, val);
        } else {
            // Right Subtree
            root.right = Insert(root.right, val);
        }
        return root;
    }

    public static void InOrder_Traversal(Node root) {
        if (root == null) {
            return;
        }
        InOrder_Traversal(root.left);
        System.out.print(root.data + " ");
        InOrder_Traversal(root.right);
    }

    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data < key) {
            return Search(root.right, key);
        } else {
            return Search(root.left, key);
        }
    }

    public static Node Delete(Node root, int key) {
        if (root.data < key) {
            root.right = Delete(root.right, key);
        } else if (root.data > key) {
            root.left = Delete(root.left, key);
        } else {
            // Case -1[Leaf Node]
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case-2 [Single Child]
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case-3 [Two Children]
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;

        }
        return root;
    }

    public static void printRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printRange(root.left, k1, k2);

        } else {
            printRange(root.right, k1, k2);
        }

    }

    public static void printPath(ArrayList<Integer> List) {
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + "->");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> List) {
        if (root == null) {
            return;
        }
        List.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(List);
        }
        printRoot2Leaf(root.left, List);
        printRoot2Leaf(root.right, List);
        List.remove(List.size() - 1);

    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }

    // Mirror BST
    public static Node CreateMirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftSubMirror = CreateMirror(root.left);
        Node rightSubMirror = CreateMirror(root.right);
        root.left = rightSubMirror;
        root.right = leftSubMirror;
        return root;

    }

    public static void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        // InOrder_Traversal(root);
        // root = Delete(root, 10);
        // System.out.println();
        // InOrder_Traversal(root);
        // printRange(root, 5, 12);
        // printRoot2Leaf(root, new ArrayList<>());
        // System.out.println(isValidBST(root, null, null));

        // Mirror BST
        Node rootB = new Node(8);
        rootB.left = new Node(5);
        rootB.right = new Node(10);
        rootB.left.left = new Node(3);
        rootB.left.right = new Node(6);
        rootB.right.right = new Node(11);
        /*
         * 8
         * / \
         * 5 10
         * / \ \
         * 3 6 11
         * 
         */
        PreOrder(rootB);
        rootB = CreateMirror(rootB);
        System.out.println();
        PreOrder(rootB);

    }

}
