package com.kaustav.sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 4, 10, -1, -56, 89, 0, 4, 23};
        System.out.println(Arrays.toString(arr));
        bubbleSortRecursion(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSortRecursion(int[] arr, int start, int end) {
        if(end==0) {
            return;
        }
        //this process is like the inner loop in iterative bubble sort
        if(start<end) {
            //if start less than end and value at start is greater than the value at start+1 then swap
            if(arr[start]>arr[start+1]) {
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            //after swapping go to start+1 and do the same;
            bubbleSortRecursion(arr,start+1,end);
        }
        /*if start==end then the largest element of the subsection of the array is already in the last
        position of the subsection so we sort the array ignoring the last element of the subsection*/
        else {
            bubbleSortRecursion(arr,0,end-1);
        }
    }
}
