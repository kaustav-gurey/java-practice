package com.kaustav.easy;

public class DigitSum {
    public static void main(String[] args) {
        int x = digitSum(9867);
        System.out.println(x);
    }
    static int digitSum(int n) {
        if(n==0) {
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
}
