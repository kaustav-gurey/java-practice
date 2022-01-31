/*
There are many format specifiers we can use. Here are some common ones:

%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
*/
package com.kaustav;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 789.1254f;
        //this does not add a new line automatically so we have to manually add "%n" at the end of each line
        //printf is used for formatted string
        System.out.printf("Formatted number upto 2 decimal places(rounded off) is %.2f %n",a);

        //printing value of pi
        System.out.println(Math.PI);
        //formatted value of pi
        System.out.printf("Pie upto 3 decimal places: %.3f %n",Math.PI);

        //string formatting
        System.out.printf("My name is %s and I am a %s. %n","Kaustav","student");
    }
}
