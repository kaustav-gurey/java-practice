package com.kaustav;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Kaustav";
        String x = "asdfgigfdsa";

        System.out.println(isPalindrome(name));
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(String s) {
        if(s==null || s.length()==0) {
            return true;
        }
        for(int i = 0; i<s.length()/2;i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
