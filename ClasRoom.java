import java.util.*;

public class ClasRoom {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        
    }
    public static int sum(Node root){
        if( root == null){
            return 0;

        }
        int leftSum =  sum(root.left);
        int rightSum  = sum(root.right);
        return leftSum + rightSum +root.data;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHit = height(root.left);
        int rightDim = diameter(root.right);
        int rightHit = height(root.left);
        int selfDim = leftHt +rightHt+1;
        return Math.max(selfDim, Math.max(leftDiam, rightDiam));


    }

    public static void main(String args[]) {
        /*
         
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root ));

    }

}
