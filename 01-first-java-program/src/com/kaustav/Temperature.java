package com.kaustav;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in celsius: ");
        float c = input.nextFloat();
        float f = (c * 9/5) + 32;
        System.out.println(c + " degree Celsius is " + f + " degree Fahrenheit.");
    }
}
