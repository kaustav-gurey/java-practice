//reverse a number using recursion
package com.kaustav.easy;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(revNum(6789));
        System.out.println(revNum2(6789));
    }
    static int revNum(int n) {
        /*base case : if the number is less than 10 then return teh number itself
        because it cannot be reversed*/
        if(n<10) {
            return n;
        }
        /*here i will be 10 if teh number has 2 digits, i will be 100 if teh number
        two digits i.e. "1+((number of digit-1)times 0)"
        so that we can multiply if with the n%10 for teh digit to be correctly placed
        in the reversed number*/
        int i = 1;
        int d = n/10;
        while(d!=0) {
            i*=10;
            d/=10;
        }
        /* last digit*i plus the reverse of the remaining number except the last digit*/
        return ((n%10)*i) + revNum(n/10);
    }
    /*same function as revNum but in this function we replaced the while loop with
    the formula : number of digits = Math.log10(n) + 1*/
    static int revNum2(int n) {
        if(n<10) {
            return n;
        }
        int i = (int)Math.pow(10,(int)Math.log10(n));
        return ((n%10)*i) + revNum2(n/10);
    }
}
