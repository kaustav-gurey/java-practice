package com.kaustav;

public class Overloading {
    public static void main(String[] args) {
        fun(8);
        fun("Kaustav");

    }
    //method overloading
    static  void fun(int a ) {
        System.out.println(a*10);

    }
    static  void fun(String name) {
        System.out.println(name);
    }
}
