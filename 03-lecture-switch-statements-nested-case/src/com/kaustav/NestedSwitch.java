package com.kaustav;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll no.: ");
        int roll = input.nextInt();
        System.out.println("Enter department: ");
        String department = input.next();

        switch (roll) {
            case 1:
                System.out.println("Roll number 1.");
                break;
            case 2:
                System.out.println("Roll number 2.");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department.");
                        break;
                    case "CSE":
                        System.out.println("CSE Department.");
                }
                break;
            case 3:
                System.out.println("Roll number 3.");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department.");
                        break;
                    case "CSE":
                        System.out.println("CSE Department.");
                }
                break;
            case 4:
                System.out.println("Roll number 4.");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department.");
                        break;
                    case "CSE":
                        System.out.println("CSE Department.");
                }
                break;
            case 5:
                System.out.println("Roll number 5.");
                break;
        }

    }
}
