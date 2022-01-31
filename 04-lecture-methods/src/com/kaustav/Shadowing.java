package com.kaustav;

public class Shadowing {
    static int x = 100;      //class variable (shadowed at line 9)
    public static void main(String[] args) {
        System.out.println(x);   //100
        int x; //the class variable at line 4 is shadowed by this
//        System.out.println(x);  //this won't work because the variable at line 4 is already shadowed
        x = 40;
        System.out.println(x); //40
        showX();  //100
    }
    static void showX() {
        System.out.println(x);
    }
}
