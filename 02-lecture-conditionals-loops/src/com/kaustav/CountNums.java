package com.kaustav;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int n = num;
        System.out.print("Enter the number you want to check: ");
        int check = input.nextInt();
        int c = 0;
        while(num>0) {
            if(num%10 == check) {
                c++;
            }
            num = num / 10;
        }
        System.out.println("The number of occurences of " + check + " in " + n + " is " + c + '.');
    }
}
