import java.util.*;

import javax.xml.crypto.NodeSetData;

public class BinaryTreeB {
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

        public static Node buildTree(int Node[]) {
            idx++;
            if (Node[idx] == -1) {
                return null;

                Node newNode = new Node(Node[idx]);
                newNode.left = buildTree(Node);
                newNode.right = buildTree(Nodes);
                return newNode;

            }

        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, 3, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }

}
