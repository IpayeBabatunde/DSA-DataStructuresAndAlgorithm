package com.ipaye;

public class DivideAndConquer {



    public static void main(String[] args) {

       int result = fact(7);
        System.out.println(result);
    }
    public static int fact(int i){

        if(i != 0 )
        return i * fact(i-1);
        return 1;
    }
}
