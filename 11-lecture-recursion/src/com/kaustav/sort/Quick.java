package com.kaustav.sort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 4, 10, -1, -56, 89, 0, 4, 23, 0};
        System.out.println(Arrays.toString(arr));
        quickSort1(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        System.out.println();
    }
    //Quicksort taking the last element of the subsection as pivot
    static void quickSort1(int[] arr, int start, int end) {
        //if start>=end then subsection passed has either no element or start is invalid since it is greater than end
        if(start>=end) {
            return;
        }
        int pivot = arr[end];
        int i = start - 1;
        int j = start;
        //this loop will run till end-1 i.e. just before pivot
        while(j<end) {
            /*for the first loop if arr[j]<pivot then i will point to the first index of the subsection and arr[j] will
            be swapped with arr[i], like this if arr[j]<pivot i will move to teh next pointer and swap*/
            if(arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        /*after the while loop all the element before index i and including i is smaller than the pivot so we will
        swap the pivot which is in the last index of the subection of the array with teh element in i+1*/
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        //the pivot will now be in i+1 which is it's correct position now we have to sort the left and right of the pivot
        //this the sort the left part of the pivot
        quickSort1(arr,start,i);
        //this will sort the right part of the pivot
        quickSort1(arr,i+2,end);

    }
}
