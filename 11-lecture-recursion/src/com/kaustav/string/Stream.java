//skip a character or a string from a bigger string
package com.kaustav.string;

public class Stream {
    public static void main(String[] args) {
        String s = "i am learning how to code in java";
        System.out.println(s);
        removeAllChar(s,'a');

        System.out.println();

        String s1 = "currently i'm learning recursion";
        System.out.println(s1);
        System.out.println(removeAllCharReturn(s1,'r'));

        System.out.println();

        String s2 = "java is used for development";
        System.out.println(s2);
        removeString(s2,"used");

        System.out.println();

        String s3 = "java is also used for cp";
        System.out.println(s3);
        System.out.println(removeStringReturn(s3,"also"));
    }
    //this will print s but removing all the ch from it
    static void removeAllChar(String s, char ch) {
        //if string is empty there is nothing to print
        if(s.isEmpty()) {
            System.out.println();
            return;
        }
        char first = s.charAt(0);
        //if first character is ch then skip it and pass the string excluding the first character in teh function
        if(first == ch) {
            removeAllChar(s.substring(1),ch);
        }
        //if first character is not ch then print it and then pass the string excluding the first character in teh function
        else {
            System.out.print(first);
            removeAllChar(s.substring(1),ch);
        }
    }
    //will return a string with teh removed character(s)
    static String removeAllCharReturn(String s, char ch) {
        //if string is empty there is nothing to print
        if(s.isEmpty()) {
            return "";
        }
        char first = s.charAt(0);
        //if first character is ch then skip it and pass the string excluding the first character in teh function
        if(first == ch) {
            return removeAllCharReturn(s.substring(1),ch);
        }
        //if first character is not ch then add it and then pass the string excluding the first character in teh function
        else {
            return first + removeAllCharReturn(s.substring(1),ch);
        }
    }
    //similar as removeAllChar but with String
    static void removeString(String s, String rem) {
        if(s.isEmpty()) {
            System.out.println();
            return;
        }
        if(s.startsWith(rem)) {
            removeString(s.substring(rem.length()),rem);
        }
        else {
            System.out.print(s.charAt(0));
            removeString(s.substring(1),rem);
        }
    }
    //similar as removeAllCharReturn but with String
    static String removeStringReturn(String s, String rem) {
        //if string is empty there is nothing to print
        if(s.isEmpty()) {
            return "";
        }
        //if first character is ch then skip it and pass the string excluding the first character in teh function
        if(s.startsWith(rem)) {
            return removeStringReturn(s.substring(rem.length()),rem);
        }
        //if first character is not ch then add it and then pass the string excluding the first character in teh function
        else {
            return s.charAt(0) + removeStringReturn(s.substring(1),rem);
        }
    }
}
