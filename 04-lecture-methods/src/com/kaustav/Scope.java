package com.kaustav;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        {
            int c = 100;
//            int a = 10;   //we cannot redeclare an already declared variable inside a block
            b = 80;        //we can modify an already declared variable inside a block
            System.out.println(c);      //we can access the variable declared and initialised inside the block from within the block
            System.out.println(b);      //we can access the variable declared outside block from within the block
        }
//        System.out.println(c);        //we can't access the variable declared and initialised inside the block from outside the block
        System.out.println(b);
        System.out.println(a);

        //scoping in for loops
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println();

//        System.out.println(i);    //we can't access i outside the for loop because it was created inside the for loop
    }
}
