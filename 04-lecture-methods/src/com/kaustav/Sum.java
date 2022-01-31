package com.kaustav;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int sol = sum3(20,30);
        System.out.println(sol);
    }
    /*
        access modifier return_type name () {
            //body
            return statement;
        }
    */
    static void sum() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is " + sum + '.');
    }

    //return the value
    static int sum2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;
    }

    //with arguements
    static int  sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
