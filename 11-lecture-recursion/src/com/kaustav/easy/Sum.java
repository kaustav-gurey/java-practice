//sum of 1-n numbers
package com.kaustav.easy;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(20));
    }
    static int sum(int n) {
        if(n==1) {
            return 1;
        }
        return n + sum(n-1);
    }
}
