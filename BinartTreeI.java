import java.util.*;
public class BinartTreeI {

    public BinartTreeI(Node root){
        if(root == null){
            return;
        }
        inorder (root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String args[]){
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, 3, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = BuildTreeI(nodes);
        Tree.inorder(root);

    }
    private static Node BuildTreeI(int[] nodes) {
        return null;
    }
    
}
