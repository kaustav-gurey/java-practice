//find all teh factors
package com.kaustav.maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factors1(36);

        factors2(20);
        factors2(36);

        factors3(20);
        factors3(36);
    }
    //O(n)
    static void factors1(int n) {
        for (int i = 1; i<=n; i++) {
            if(n%i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //O(sqrt(n))
    //better time complexity but the order of teh factors is not ascending
    static void factors2(int n) {
        for (int i = 1; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                if(n/i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
        System.out.println();
    }
    //both time and space will be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> fac2 = new ArrayList<Integer>();
        for (int i = 1; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                if(n/i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    fac2.add(n/i);
                }
            }
        }
        for(int i = fac2.size() - 1; i>=0; i--) {
            System.out.print(fac2.get(i) + " ");
        }
        System.out.println();
    }

}
