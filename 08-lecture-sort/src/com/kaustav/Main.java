package com.kaustav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 45, 76, 2, -10, -2, 1, 32, 1, 90, 45, 34, 3, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {2, 45, 76, 2, -10, -2, 1, 32, 1, 90, 45, 34, 3, 0};
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {2, 45, 76, 2, -10, -2, 1, 32, 1, 90, 45, 34, 3, 0};
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {5, 2, 3, 1, 6, 7, 8, 4};
        cyclicSort(arr4);
        System.out.println(Arrays.toString(arr4));

    }
    //BUBBLE SORT
    static void bubbleSort(int[] arr) {
        //run the steps n-1 times
        for(int i = 0; i<arr.length-1; i++) {
            //if this is not changed to true then that subsection of the array is already sorted
            boolean swap = false;
            //for each step, maximum will come to the 2nd position
            for(int j = 1; j<arr.length-i ;j++) {
                //swap if item if smaller than the previous item
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }
    //SELECTION SORT
    static void selectionSort(int[] arr) {
        /*this will linearly go through the subsection of the array and swap the
        largest element of the subsection to the last element of the subsection*/
        for(int i = 0; i<arr.length-1; i++) {
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex,last);
        }
    }
    //INSERTION SORT
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    //CYCLIC SORT(this will work if the largest and smallest element of the array is given and it is in an A.P with common difference 1)
    static void cyclicSort(int[] arr) {
        //if the array has elements from 1-n
        int i = 0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            //swap the element in the i with the element in the correct position of the element in i
            if(arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            }
            //increment the counter if teh correct element is in index i
            else {
                i++;
            }
        }
    }
    //this will swap two elements of an array
    static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    //this will return the index of the largest number in the given subarray
    static int getMaxIndex(int[] arr, int start, int end) {
        int x = start;
        for(int i = start; i<= end; i++) {
            if(arr[x]<arr[i]) {
                x = i;
            }
        }
        return x;
    }
}