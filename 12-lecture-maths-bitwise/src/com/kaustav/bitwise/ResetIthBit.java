//Reset ith bit means make the ith bit of the number 0
package com.kaustav.bitwise;

public class ResetIthBit {
    public static void main(String[] args) {
        int a = 45;
        System.out.println(a);
        //45 in binary 101101
        //this should turn the 101101 into 101001 which is 41 in decimal
        resetBit(a,3);
    }
    static void resetBit(int num, int i) {
        int n = 1<<(i-1);
        //& the bit with 0 so it will become 0
        System.out.println(num&(~n));
    }
}
