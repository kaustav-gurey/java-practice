//https://youtu.be/lmSpZ0bjCyQ?t=1989
package com.kaustav.maths;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(36));
        System.out.println(sqrt(100));
        System.out.println(sqrt(40));
    }
    static double sqrt(double n) {
        double x = n;
        double root;
        while(true) {
            root = 0.5 * (x + (n/x));

            if(Math.abs(root-x)<0.01) {
                break;
            }

            x = root;
        }
        return root;
    }
}
