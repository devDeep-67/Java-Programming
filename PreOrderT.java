import java.util.*;
import java.util.LinkedList;

import javax.sound.sampled.Line;

public class PreOrderT {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void PreOrder_Traversal(Node root) {
            if (root == null) {
                // System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            PreOrder_Traversal(root.left);
            PreOrder_Traversal(root.right);
        }

        public static void InOrder_Traversal(Node root) {
            if (root == null) {
                // System.out.print("-1" + " ");
                return;
            }
            InOrder_Traversal(root.left);
            System.out.print(root.data + " ");
            InOrder_Traversal(root.right);
        }

        public static void PostOrder_Traversal(Node root) {
            if (root == null) {

                return;
            }
            PostOrder_Traversal(root.left);
            PostOrder_Traversal(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder_Traversal(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data + " ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }

                }

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

        public static int Sum(Node root) {
            if (root == null) {
                return 0;
            }
            int ls = Sum(root.left);
            int rs = Sum(root.right);
            int tree_sum = ls + rs + root.data;
            return tree_sum;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // tree.PreOrder_Traversal(root);
        // System.out.println();
        // tree.InOrder_Traversal(root);
        // System.out.println();
        // tree.PostOrder_Traversal(root);
        // System.out.println();
        // tree.levelOrder_Traversal(root);
        // System.out.println();
        // System.out.println(tree.Height(root));
        System.out.println(tree.count_of_Nodes(root));
        System.out.println(tree.Sum(root));

    }
}