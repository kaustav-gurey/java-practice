package com.kaustav.easy;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(10200000));
        System.out.println(countZeros(18765));
        System.out.println(countZeros(0));
    }
    static int countZeros(int n) {
        //base case
        if(n<10) {
            //if the number itself is zero i.e. single digit and 0 then return 1
            if(n==0) {
                return 1;
            }
            //if the number is single digit but is not zero then return 0
            return 0;
        }
        /*if the last element of the number is 0 then,
        return 1 + (the number of zeroes in n/10)*/
        if(n%10==0) {
            return 1+countZeros(n/10);
        }
        return countZeros(n/10);
    }
}
