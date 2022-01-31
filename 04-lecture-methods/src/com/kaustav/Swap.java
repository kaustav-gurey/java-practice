package com.kaustav;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b);

        String n = "Peter Maximoff";
        changeName(n);
        System.out.println(n);
    }
    static void changeName(String name) {
        name = "Charles Xavier.";
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
