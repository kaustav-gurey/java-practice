package com.kaustav.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;

        //Integer num = new Integer(45);
        //the above line is doing the same as this line
        Integer num = 45;

        System.out.println(a);
        System.out.println(num);

        //because num is a wrapper class we can use many inbuilt methods with the created object
        System.out.println(num.byteValue());
        System.out.println(num.toString());
    }
}
