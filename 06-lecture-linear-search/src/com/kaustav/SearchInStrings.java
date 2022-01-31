package com.kaustav;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kaustav";
        System.out.println(search(name,'u'));

    }
    //method 1
    static boolean search(String s, char c) {
        if(s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
    //method 2
    static boolean search2(String s, char c) {
        if(s.length() == 0) {
            return false;
        }
        //toCharArray converts the String into a character array
        for(char ch : s.toCharArray()) {
            if(ch == c) {
                return true;
            }
        }
        return false;
    }
}
