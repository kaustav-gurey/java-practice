package com.kaustav.intro;

public class Fibonacci {
    public static void main(String[] args) {
        int x = fib(10);
        System.out.println(x);
    }
    static int fib(int n) {
        if(n<2) {
            return n;
        }
        return fib(n-1) +fib(n-2);
    }
}
