import java.io.*;
import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BST_LowestCommonAncestor {
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static int Find(int v1, int v2 , Node root){
        if(root == null){
            return 0;
        }
        int max = Math.max(v1,v2);
        int min = Math.min(v1,v2);
        if(root.data > max){
            return Find(v1,v2,root.left);
        }
        else if(root.data < min){
            return Find(v1,v2,root.right);
        }
        return root.data;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for(int i = 0;i<n;i++){
            int val = sc.nextInt();
            root = insert(root,val);
        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int ans = Find(v1, v2,root);
        System.out.println(ans);

    }
}