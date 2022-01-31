package com.kaustav;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        //in java there is no nextChar, so we take
        // string input: input.next()
        // trim the extra spaces at the beginning and end of teh word: trim()
        // and extract the first index of the string: charAt(0)
        System.out.println(ch);

        String word = "Java";
        System.out.println(word.charAt(3));
        //prints the character at the 3rd index of the string

        //Q. Check if an alphabet is lower case or upper case
        char a = input.next().trim().charAt(0);
        if(Character.isAlphabetic(a)) {
            if(a >= 'a' && a <= 'z') {
                System.out.println("This alphabet is Lowercase.");
            }
            else {
                System.out.println("This alphabet is Uppercase.");
            }
        }
        else {
            System.out.println("This is not an alphabet.");
        }
    }
}









