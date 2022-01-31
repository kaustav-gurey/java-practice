package com.kaustav;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));

        swap(arr,2,0);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int from, int to) {
        int temp = arr[to];
        arr[to] = arr[from];
        arr[from] = temp;
    }
    static void reverse(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while(s<e) {
            swap(arr,s,e);
            s++;
            e--;
        }
    }
}
