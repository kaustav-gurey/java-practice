package com.kaustav.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    //will only run once during runtime
    static {
        System.out.println("I am in static block");
        b = a * 10;
    }

    public static void main(String[] args) {

        System.out.println("i am in static block");

        //the value of a will be 4
        //the value of b will be 40 even before the object creation because the static block will run
        // irrespective of object creation and runs even before tehe main method thus the print statement
        // in the static block will be shown before the print statement in the main block before the print statement

        System.out.println("a: " + StaticBlock.a + " b: " + StaticBlock.b);

        StaticBlock obj1 = new StaticBlock();
        System.out.println("a: " + StaticBlock.a + " b: " + StaticBlock.b);

        StaticBlock.b += 20;
        StaticBlock obj2 = new StaticBlock();
        System.out.println("a: " + StaticBlock.a + " b: " + StaticBlock.b);

        StaticBlock obj3 = new StaticBlock();
        System.out.println("a: " + StaticBlock.a + " b: " + StaticBlock.b);


    }
}
