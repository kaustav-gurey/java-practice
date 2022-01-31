package com.kaustav;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;
        while(num>0) {
            ans = (ans*10) + (num%10);
            num = num/10;
        }
        System.out.println(ans);
    }
}
