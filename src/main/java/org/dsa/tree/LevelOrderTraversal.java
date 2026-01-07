package org.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void levelOrderTraversal1(BinaryTree.Node root){
         if(root==null) return;
        Queue<BinaryTree.Node> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            BinaryTree.Node curr=q.poll();
            System.out.print(curr.val+" ");
            if(curr.left !=null){
                q.add(curr.left);
            }
            if(curr.right !=null){
                q.add(curr.right);
            }
        }

    }

    // below method is about printing in below format
    // 10
    // 20 30
    // 40  50
    public static void levelOrderTraversal2(BinaryTree.Node root){
       if(root==null) return;
       Queue<BinaryTree.Node> q= new LinkedList<>();
       q.add(root);
       q.add(null);
       while(q.size()>1){
           BinaryTree.Node curr = q.poll();

           if(curr == null){
               System.out.println();
               q.add(null);
               continue;
           }
           System.out.println(curr.val+" ");
           if(curr.left !=null) q.add(curr.left);
           if(curr.right !=null) q.add(curr.right);

       }
    }

    public static void levelOrderTraversal3(BinaryTree.Node root) {
        if (root == null) return;
        Queue<BinaryTree.Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty() == false) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                BinaryTree.Node curr = q.poll();
                System.out.print(curr.val + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);

            }
            System.out.println();
        }
    }
}
