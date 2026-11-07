import java.io.*;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearchTreeInsertion {
    public static Node insert(Node root , int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data > val){
            root.left = insert(root.left , val);
        }
        else if(root.data < val){
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Node root = null;
            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                root = insert(root, val);
            }
            printInOrder(root);
        }
        scanner.close();
    }

    public static void printInOrder(Node root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }
}

