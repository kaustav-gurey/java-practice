package com.kaustav.easy;

public class Numbers {
    public static void main(String[] args) {
        nToOne(5);

        System.out.println();

        concept(5);

        System.out.println();

        bothWays(5);

        System.out.println();

        oneToN(5);


    }
    static void nToOne(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        nToOne(n-1);
    }
    //same code as nToOne but with the (--) operator
    static void concept(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        /*this line won't work because this operator decrements the value of n in the next line and
        not on the line itself thus the value that is passed as teh argument is not the decremented
        value but the original value*/
        //concept(n--);
        //this line will work because this operator decrements the value of n on teh same lien itself
        concept(--n);
    }
    static void oneToN(int n) {
        if(n==0) {
            return;
        }
        oneToN(n-1);
        System.out.println(n);
    }
    static void bothWays(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
        bothWays(n-1);
        System.out.println(n);
    }
}
