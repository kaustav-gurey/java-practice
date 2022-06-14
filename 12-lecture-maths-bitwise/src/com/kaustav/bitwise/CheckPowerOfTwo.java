//Explanation : https://www.youtube.com/watch?v=fzip9Aml6og&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=26&t=2272s =>Question:12
package com.kaustav.bitwise;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(64));
        System.out.println(isPowerOfTwo(70));
    }
    static boolean isPowerOfTwo(int n){
        if(n==0){
            return false;
        }
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
}
