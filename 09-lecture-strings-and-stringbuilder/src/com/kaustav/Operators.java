package com.kaustav;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        //will print the characters themselves
        System.out.println('a');
        System.out.println('b');

        //but this will convert the characters into their ASCII value and add them
        System.out.println('a' + 'b');

        //this will add/concatenate then as String
        System.out.println("a" + "b");

        //this will add the ASCII value of 'a' with 3
        System.out.println('a' + 3);

        //this will add the ASCII value of 'a' with 3 and then convert the summation into a character
        System.out.println((char)('a' + 3));

        //here int will be converted to Integer and it will call toString()
        //i.e this is same as ("a" + "1")
        System.out.println("a" + 1);
        //this is also the same thing
        System.out.println("a" + new Integer(1));

        //this will call the to.String of Arraylist and because it is empty it'll just print brackets
        System.out.println("a" + new ArrayList<>());

        //the opeartor '+' is only valid for primitives or if amy one objects is a String
        //thus this will show error
        //System.out.println(new ArrayList<>() + new Integer(1));
        //this will work because one object is String
        System.out.println(new ArrayList<>() + " " + new Integer(1));
    }
}
