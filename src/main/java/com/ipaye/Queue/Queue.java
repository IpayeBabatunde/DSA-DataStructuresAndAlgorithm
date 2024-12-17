package com.ipaye.Queue;

public class Queue {

    private int front=0;
    private int rear=-1;
    private int size=0;
    private int[] arr = new int[4];

    public void enqueue(int data){

        rear = (rear + 1 ) % 4;
        arr[rear] = data;
        size++;
    }

    public int dequeue(){
        int data = arr[front];
        front++;
        return data;

    }

    public void show(){
        for (int i=front; i<size; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
}
