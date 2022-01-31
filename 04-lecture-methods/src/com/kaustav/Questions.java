package com.kaustav;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(primeOrNot(n));
        System.out.println(isArmstrong(n));
    }
    //armstrong number
    static boolean isArmstrong(int n) {
        int original = n;
        int check =0;
        while(n>0) {
            check += Math.pow(n%10,3);
            n = n/10;
        }
        return check==original;
    }
    //check if prime
    static String primeOrNot(int num) {
        if(num==0) {
            return("Neither prime nor composite.");
        }
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i == 0) {
                    return("Composite.");
                }
            }
            return("Prime.");
        }
    }
}
