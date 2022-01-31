package com.kaustav;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        String name = null;
        //this will print "null" because name is null
        System.out.println(name);

        //this won't print the contents of the array
        System.out.println(new int[]{1, 2, 3, 4, 5, 6});
        //to print the contents of the array we have to use "Arrays.toString()"
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6}));

        //prints "56" as a String
        System.out.println(66);

        Integer num = new Integer(56);
        //here both the line mean the same thing and the "toString()" in the first line is unnecessary
        System.out.println(num.toString());
        System.out.println(num);
    }
}
