package Trees;

import javax.swing.*;

class Nodee{
    int data;
    Nodee left;
    Nodee right;
    public Nodee(int key){
        data=key;
    }
}
public class preOrderTraversal {
    static void preorder(Nodee a){
        if(a==null){
            return;
        }
        System.out.println(a.data);
        preorder(a.left);
        preorder(a.right);
    }
    public static void main(String[] args) {
        Nodee root = new Nodee(1);
        root.left = new Nodee(2);
        root.right = new Nodee(3);
        root.right.left = new Nodee(5);
        preorder(root);
    }
}
