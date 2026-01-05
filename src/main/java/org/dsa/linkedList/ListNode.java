package org.dsa.linkedList;

public class ListNode {

    public class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item){
        Node nn = new Node();
        nn.val = item;
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
        }else{
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"--->");
            temp = temp.next;
        }
    }
    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }else{
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public Node getNode(int k){
        Node temp = head;
        for(int i=0; i<k; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void addAtIndex(int item, int index){
        if(index == 0){
            addFirst(item);
        }else if(index == size){
            addLast(item);
        }else{
            Node kthNode = getNode(index-1);
            Node nn = new Node();
            nn.val = item;
            nn.next = kthNode.next;
            kthNode.next = nn;
            size++;
        }
    }

    public int getFirst() {
        if(head == null){
           return 0;
        }
        return head.val;
    }

    public int getLast() {
        if(head==null){
         return 0;
        }
        return tail.val;
    }

    public int getAtIndex(int index){
        return getNode(index).val;
    }

    public int removeFirst(){
        Node temp = head;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            temp.next = null;
        }
        size--;
        return temp.val;
    }

    public int remvoeLast(){
        if(size==1){
            return removeFirst();
        }else{
            Node prev = getNode(size-2);
            int val =tail.val;
            tail = prev;
            size--;
            return val;
        }
    }
    public int removeAtIndex(int k) {
        if (k == 0) {
            return removeFirst();
        } else if (size == k - 1) {
            remvoeLast();
        } else {
            Node prev = getNode(k - 1);
            Node curr = getNode(k);
            prev.next = curr.next;
            size--;
            return curr.val;
        }
        return 0;
    }

    public void reverseList(){
        Node prev = null;
        Node curr=head;

        tail = head;
         while(curr !=null){
             Node nextNode = curr.next;
             curr.next = prev;
             prev = curr;
             curr = nextNode;

         }
         head = prev;
    }

    public boolean detectCycle(){
        if(head==null || head.next == null){
            return false;
        }

        Node slow=head;
        Node fast=head;
        while(slow !=null && fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow == fast){
            return true;
        }
        return false;
    }
    public Node reverseKGroup(Node head, int k) {

        if (head == null || k <= 1) {
            return head;
        }

        Node curr = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }

    public void reverseListKGroup(int k){
       head =  reverseKGroup(head,3);
    }

    public void removeDuplicate(){
        if(head == null || head.next==null){
            return;
        }
        Node curr=head;
        while(curr !=null && curr.next !=null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
                size--;
            }else{
                curr = curr.next;
            }

        }
        tail=curr;
    }
    public static void main(String[] args){
        ListNode list = new ListNode();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

    //    list.display();

        list.addLast(40);
        list.addLast(50);
        list.addLast(50);
      //  list.display();


        list.addAtIndex(6,3);
        list.display();
       int first =  list.getFirst();
       System.out.println();
       System.out.println("First :: "+first);
       int last = list.getLast();

       System.out.println("Last :: "+last);
       int indexVal = list.getAtIndex(3);
       System.out.println("At Index :: "+indexVal);

       list.reverseList();
       System.out.println("After reverse : ");
       list.display();

      boolean hasCycle= list.detectCycle();
      System.out.println("detect Cycle :: "+hasCycle);

       list.reverseListKGroup(3);
        System.out.println("After reversing List in group : ");
        list.display();

        System.out.println("before removing Duplicate  : ");
        list.display();
        list.removeDuplicate();
        System.out.println("After removing Duplicate  : ");
        list.display();


    }
}
