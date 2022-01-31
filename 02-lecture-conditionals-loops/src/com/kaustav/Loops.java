package com.kaustav;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for loops
        /*
            Syntax:
            for(initialisation; condition; increment/decrement) {
                body
            }
        */
        //Q: Print numbers from 1 to 5
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
        }

        //while loops
        /*
            Syntax:
            while(condition) {
                body
            }
        */
        //Q: Print numbers from 1 to 5
        int num = 1;
        while(num<6) {
            System.out.println(num);
            num++;
        }

        //do while loops
        /*
            Syntax:
            do{
                body
            }while(condition);
        */
        //Q: Print numbers from 1 to 5
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while(n<6);
    }
}
