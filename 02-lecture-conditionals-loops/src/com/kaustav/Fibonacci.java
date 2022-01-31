package com.kaustav;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int pos = input.nextInt();
        int a1 = 0;
        int a2 = 1;
        int ans;
        for(int i = 0; i<pos; i++) {
            ans = a1;
            a1 = a2;
            a2 = ans + a2;
            System.out.print(ans + " ");
        }
    }
}
