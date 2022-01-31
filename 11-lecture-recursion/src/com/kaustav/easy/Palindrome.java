//check if a number is a palindrome or not
package com.kaustav.easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(6789));
        System.out.println(palindrome(67876));
    }
    //refer to "ReverseNum.java" to understand the function
    static int revNum(int n) {
        if(n<10) {
            return n;
        }
        int i = (int)Math.pow(10,(int)Math.log10(n));
        return ((n%10)*i) + revNum(n/10);
    }
    //just checking if teh number is equal to it's reverse to determine if it's a palindrome or not
    static boolean palindrome(int n) {
        return n == revNum(n);
    }
}
