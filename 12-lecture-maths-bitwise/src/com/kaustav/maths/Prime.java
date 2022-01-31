package com.kaustav.maths;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(56));
        System.out.println(isPrime(7));
        System.out.println(isPrime(20));
        System.out.println(isPrime(2));


        System.out.println(isPrime1(13));
        System.out.println(isPrime1(56));
        System.out.println(isPrime1(7));
        System.out.println(isPrime1(20));
        System.out.println(isPrime1(2));

        //show all the numbers from 1-20 and show if they are prime or not
        for(int i = 1; i<=20; i++) {
            System.out.println(i+" : "+isPrime(i));
        }
    }
    static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    //same function without using Math.sqrt
    static boolean isPrime1(int n) {
        if(n<=1) {
            return false;
        }
        int i = 2;
        while(i*i<=n) {
            if(n%i==0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
