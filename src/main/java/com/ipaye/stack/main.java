package com.ipaye.stack;

public class main {
    public static void main(String[] args) {

        Stack nums = new Stack();

        nums.push(70);
        nums.push(40);
        System.out.println(nums.pop());
        nums.push(79);
        nums.push(49);
        System.out.println(nums.peek());
        nums.push(34);
        nums.push(32);

        nums.printStack();
    }
}
