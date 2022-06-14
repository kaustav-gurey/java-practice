package com.kaustav.bitwise;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(45));
        System.out.println(countSetBits(10));
    }
    static int countSetBits(int n){
        int sol = 0;
        char[] bin = Integer.toBinaryString(n).toCharArray();
        for(char ch : bin){
            if(ch=='1'){
                sol++;
            }
        }
        return sol;
    }
}
