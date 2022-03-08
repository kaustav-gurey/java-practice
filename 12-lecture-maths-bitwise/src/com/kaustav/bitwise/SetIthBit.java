//Set the ith bit i.e make the ith but of the number 1
package com.kaustav.bitwise;

public class SetIthBit {
    public static void main(String[] args) {
        int a = 45;
        System.out.println(a);
        //45 in binary 101101
        //this should turn the 101101 into 101111 which is 47 in decimal
        setBit(a,2);
    }
    static void setBit(int num, int i) {
        //or the bit with 1 so it will become 1
        System.out.println(num|(1<<(i-1)));
    }
}
