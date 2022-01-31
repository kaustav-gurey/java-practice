//https://www.geeksforgeeks.org/sum-triangle-from-array/
package com.kaustav.intro;

import java.util.Arrays;

public class GFGSumTriangle {
    public static void main (String[] args) {
        System.out.println("GfG!");
        int[] A = {1, 2, 3, 4, 5};
        func(A);
    }
    static void func(int[] arr) {
        if(arr.length<2) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] sol = new int[arr.length-1];
        for(int i =0;i<sol.length;i++) {
            int temp = arr[i]+arr[i+1];
            sol[i]=temp;
        }
        func(sol);
        System.out.println(Arrays.toString(arr));
    }
}
