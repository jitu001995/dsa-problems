package org.dsa.Thread;

public class EvenOddThread  {
   public static int MAX = 10;
   public static  int number = 1;

    public static final Object lock = new Object();
    public static void main(String[] args){
        EvenOddThread printer = new EvenOddThread();

        Thread oddThread = new Thread(() -> printer.oddThread(),"oddThread");
        Thread evenThread = new Thread(() -> printer.printEven(), "EvenThread");

        oddThread.start();
        evenThread.start();
    }

    private void printEven() {
        while(number <= MAX){
            synchronized (lock){
                while(number % 2 !=0){
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                  }
                if(number <= MAX){
                    System.out.println(Thread.currentThread().getName() +" : "+number);
                   number++;
                   lock.notify();
                }
            }
        }
    }

    public static void oddThread(){
        while(number <= MAX){
            synchronized (lock){
                while(number %2 == 0){
                    try{
                    lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                }
                if(number <= MAX){
                    System.out.println(Thread.currentThread().getName()+" : "+number);
                    number++;
                    lock.notify();
                }
            }

        }
    }

}
