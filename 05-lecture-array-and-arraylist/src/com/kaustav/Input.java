package com.kaustav;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //array of primitives(int, float, double ...etc)
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        //accessing all the elements of the array using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //accessing all the elements of the array using for-each loop
        for(int num: arr) {  //for every element of array print element
            System.out.print(num + " ");  // here num represents each element of the array
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        String s = Arrays.toString(arr);  // stores the array in a String with brackets and commas
        System.out.println(s);

        //array of objects eg. String
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
