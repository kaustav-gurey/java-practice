package com.kaustav;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //typecasting from float to int
//        int x = (int)(67.78f);
//        System.out.println(x);

        //automatic type promotion in expressions
//        int a= 258;
//        byte  b = (byte)(a);  //258 % 256 = 2
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        //in the above task the result of the intermediate term a*b is
//        //higher than the value of byte but because the result is
//        //stored in an integer java is automatically promoting the byte
//        //variables into int
//
//        System.out.println(d);
//
//        byte x = 90;
//        x = x * 2;
//        System.out.println(x);
//        //this will show error because whenever you perform operations
//        //with byte it is automatically typecasted into int thus the
//        //result has to be stored in an int and not a byte

//        int number = 'a';
//        System.out.println(number);  //ASCII value of 'a' in 97

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
        //double
    }
}
