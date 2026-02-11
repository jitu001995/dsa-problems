package org.dsa.stack;

public class StackImpl{
    private int[] arr;
    private int top;
    private int capacity;

    StackImpl(int size){
         capacity=size;
         arr = new int [capacity];
         top=-1;
    }

    public void push(int x){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
        }
        arr[++top] = x;

    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Overflow ");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
