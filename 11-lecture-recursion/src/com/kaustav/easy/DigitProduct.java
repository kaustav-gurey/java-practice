package com.kaustav.easy;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(digitProduct(9867));
        System.out.println(digitProduct(0));
    }
    static int digitProduct(int n) {
        if(n<10) {
            return n;
        }
        return n%10 * digitProduct(n/10);
    }
}
