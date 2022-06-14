package com.kaustav.bitwise;

public class RangeXOR {
    public static void main(String[] args) {
        System.out.println(rangeXOR(3,9));
    }
    public static int rangeXOR(int a, int b){
        return xor(b)^xor(a-1);
    }
    public static int xor(int n){
        if(n%4==0){
            return n;
        }
        else if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        return 0;
    }
}
