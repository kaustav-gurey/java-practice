package com.kaustav.sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 4, 10, -1, -56, 89, 0, 4, 23};
        System.out.println(Arrays.toString(arr));
        selectionSortRecursion(arr, 0, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSortRecursion(int[] arr,int start, int end, int max) {
        if(end==0) {
            return;
        }
        //this will store the index of the maximum value of every subsection in max till start==end
        if(start<end) {
            if(arr[max]<arr[start]) {
                max = start;
            }
            selectionSortRecursion(arr,start+1,end,max);
        }
        /*here max will have the index of the highest value from 0 to end-1, so we'll have to check for value at end,
         if value at end is smaller than value at max then we'll swap max and end otherwise leave it as it is*/
        if(start==end) {
            if(arr[max]>arr[end]) {
                int temp = arr[max];
                arr[max] = arr[end];
                arr[end] = temp;
            }
            /*after doing the needfull the largest element of the subsection of the array is in the last
            position of the subsection so we sort the array ignoring the last element of the subsection*/
            selectionSortRecursion(arr,0,end-1,0);
        }
    }
}
