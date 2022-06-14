//Explanation : https://www.youtube.com/watch?v=fzip9Aml6og&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=26&t=2272s =>Question:10
package com.kaustav.bitwise;

public class CountDigitsInBinary {
    public static void main(String[] args) {
        System.out.println(countDigits(6));
        System.out.println(countDigits(10));
    }
    static int countDigits(int n){
        int sol = 0;
        while(n>0){
            n>>=1;
            sol++;
        }
        return sol;
    }
}
