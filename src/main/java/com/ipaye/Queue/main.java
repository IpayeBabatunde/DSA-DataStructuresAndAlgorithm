package com.ipaye.Queue;



public class main {

    public static void main(String[] args) {


        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println(queue.dequeue());

        queue.enqueue(12);
        queue.show();
    }

}
