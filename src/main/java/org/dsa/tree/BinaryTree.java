package org.dsa.tree;

import java.util.Scanner;

public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }
    private Node root;
    public BinaryTree(){

    }


    public void display(Node node){
        String s = "";
        s = "<--"+node.val+"-->";
        if(node.left !=null){
            s = node.left.val+s;
        }else{
            s = "."+s;
        }

        if(node.right !=null){
            s = s+node.right.val;
        }else{
            s = s+".";
        }
        System.out.println(s);
        display(node.left);
        display(node.right);
    }

    public boolean find(Node nn, int item){
        if(nn == null){
            return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left || right;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually create nodes
        BinaryTree.Node root = tree.new Node(10);
        BinaryTree.Node n1 = tree.new Node(20);
        BinaryTree.Node n2 = tree.new Node(30);
        BinaryTree.Node n3 = tree.new Node(40);
        BinaryTree.Node n4 = tree.new Node(50);

        // Connect nodes to form the tree
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n2.left = n4;

        // Set root
        tree.root = root;

        // Test display
        tree.display(tree.root);

        // Test find
        System.out.println("Find 50: " + tree.find(tree.root, 50)); // true
        System.out.println("Find 90: " + tree.find(tree.root, 90)); // false

    }
}
