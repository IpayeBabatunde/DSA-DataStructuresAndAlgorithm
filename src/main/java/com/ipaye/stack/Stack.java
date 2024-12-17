package com.ipaye.stack;

public class Stack {

    private int[] arr = new int[7];
    int top = -1;
    int size;

    public Stack(){
        size = arr.length;
        top =-1;
    }

    public void push(int data) {
        top++;
        if(top<size)
        arr[top] = data;
        else
            System.out.println("Stack overflow");
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public void printStack(){
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }



}
