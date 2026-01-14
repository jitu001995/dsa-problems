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
        if(node == null) return;
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

    public int heightOfBt(Node root){
        if(root==null){
            return -1;
        }
        return Math.max(heightOfBt(root.left),heightOfBt(root.right))+1;
    }

    public void inOrderTraversal(Node root){
        if(root==null){ return;}
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root){
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    private void printKDistinct(Node root, int k) {
        if(root==null)return;
        if(k==0){
            System.out.print(root.val+" ");
        }else{
            printKDistinct(root.left,k-1);
            printKDistinct(root.right,k-1);
        }
    }

    private int isBalanced(Node root) {
        // 1️⃣ Empty tree has height 0 → balanced
        if (root == null) return 0;

        // 2️⃣ Check left subtree
        int lh = isBalanced(root.left);
        if (lh == -1) return -1; // left subtree unbalanced

        // 3️⃣ Check right subtree
        int rh = isBalanced(root.right);
        if (rh == -1) return -1; // right subtree unbalanced

        // 4️⃣ Check balance condition at current node
        if (Math.abs(lh - rh) > 1)
            return -1; // current node is unbalanced

        // 5️⃣ Return height if balanced
        return Math.max(lh, rh) + 1;
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

       int height =  tree.heightOfBt(tree.root);

       System.out.println("Height of BT :: "+height);

        System.out.print("InOrder traversal :: ");
        System.out.println("");
       tree.inOrderTraversal(tree.root);

        System.out.println("");
        System.out.print("PreOrder traversal :: ");
        System.out.println("");
       tree.preOrderTraversal(tree.root);


        System.out.println("");
        System.out.print("PostOrder traversal :: ");
        System.out.println("");
       tree.postOrderTraversal(tree.root);

       System.out.println();
       System.out.println("Printing k Distinct :: ");
       tree.printKDistinct(tree.root,2);
        System.out.println();
        System.out.println("Level Order Traversal :: ");
        LevelOrderTraversal.levelOrderTraversal1(tree.root);  // 10 20 30 40 50

        System.out.println();
        System.out.println("Level Order Traversal 2 Line by Line :: ");
        LevelOrderTraversal.levelOrderTraversal2(tree.root);

        System.out.println();
        System.out.println("Level Order Traversal 3 Line by Line :: ");
        LevelOrderTraversal.levelOrderTraversal3(tree.root);

        System.out.println();
        System.out.println("Checking tree is Balanaced or NOt :: ");
        int result = tree.isBalanced(tree.root);
        System.out.println(result != -1);

    }


}
