package com.kaustav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number from 1-7: ");
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "mango" :
//                System.out.println("King of fruits.");
//                break;
//            case "apple" :
//                System.out.println("A sweet red fruit.");
//                break;
//            case "orange" :
//                System.out.println("Round orange fruit.");
//                break;
//            case "grapes" :
//                System.out.println("Small round fruit.");
//                break;
//            default :
//                System.out.println("Please enter a valid fruit.");
//        }

        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a day");
                break;
        }

    }
}
