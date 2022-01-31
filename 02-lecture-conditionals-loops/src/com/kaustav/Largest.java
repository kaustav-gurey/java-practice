package com.kaustav;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Q. Find the largest of three numbers

        //solution 1
        int mx = b;
        if(a>mx) {
            mx = a;
        }
        if(c>mx) {
            mx=c;
        }
        System.out.println(mx);

        //solution 2
        int max = Math.max(a,Math.max(b,c));
        System.out.println(max);
    }
}
