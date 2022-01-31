package com.kaustav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey how are you?");
        Scanner input = new Scanner(System.in);
        //taking a string input and printing it
        System.out.println(input.nextLine());

        System.out.println("What is the date today?");
        //taking a int input and printing it
        System.out.println(input.nextInt());
    }
}
