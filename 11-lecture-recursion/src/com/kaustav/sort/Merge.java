package com.kaustav.sort;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 4, 10, -1, -56, 89, 0, 4, 23};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeSort(arr)));

        System.out.println();

        System.out.println(Arrays.toString(arr));
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //this will return a sorted array, to sort array in place using merge sort refer mergeSortInPlace
    static int[] mergeSort(int[] arr) {
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;

        //copyofRange creates a copy of the original range(in this case from 0 to mid-1)
        //note: mid here is exclusive actually 0-(mid-1) will be copied
        //left will now have the left half of the array but sorted
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        //note here arr.length is exclusive thus the range is mid-(arr.length-1)
        //right will now have the right half of the array but sorted
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        //we will merge teh left and right, both sorted arrays and we will return the merged array
        return merge(left,right);
    }
    //in this function we will pass two sorted arrays and it will combine the two of them into one sorted array
    private static int[] merge(int[] first, int[] second) {
        //will create an array sol of size first.length + second.length to store both there elements in it
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        //the loop will run while i is in first's index and j is in second's index
        while(i<first.length && j<second.length) {
            /*if the element in first is smaller than element in second then the element in first is added
            to sol and the first pointer is incremented*/
            if(first[i]<second[j]) {
                mix[k] = first[i];
                i++;
            }
            //else add the element in second to sol and increment the second pointer
            else {
                mix[k] = second[j];
                j++;
            }
            //increment the sol pointer after every addition to the array
            k++;
        }
        /*if first was longer than second then the remaining elements of first is added in sol because
        it is already sorted*/
        while(i<first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        /*if second was longer than first then the remaining elements of second is added in sol because
        it is already sorted*/
        while(j<second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    //end should be equal to arr.length
    static void mergeSortInPlace(int[] arr, int start, int end) {
        //if the length of the subsection of teh array passed is 1 do nothing
        if(end-start == 1) {
            return;
        }
        int mid = start + (end-start)/2;

        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid,end);

        mergeInPlace(arr,start,mid,end);
    }
    //start = (index of thr first element in the first half)
    //mid = (index of the last element of first half + 1) i.e. the first element of the second half
    //end = (index of the last element of second half + 1)
    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        //we will create a new array similar to length of the subsection of te array passed
        int[] mix = new int[end - start];

        int i = start;
        int j= mid;
        int k = 0;

        /*this loop will run while i is within the range of the first sorted half of the subsection of the
        array and j is within the range of the second sorted half of the subsection of the array*/
        while(i<mid && j<end) {
            /*if the element in the first half of the subsection of the array is smaller than the element in
            * the second half of the subsection of the array we will add the element in the first half of the
            * subsection of the array to the newly created array and increase it's pointer by 1*/
            if(arr[i]<arr[j]) {
                mix[k] = arr[i];
                i++;
            }
            /*if the element in the second half of the subsection of the array is smaller than the element in
            * the first half of the subsection of the array we will add the element in the second half of the
            * subsection of the array to the newly created array and increase it's pointer by 1*/
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //if any of teh element are left in the first half add them in the new array
        while(i<mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        //if any of teh element are left in the second half add them in the new array
        while(j<end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        //replace all the values of the passed subsection with the sorted values of the newly created array
        for(k = 0; k<mix.length; k++) {
            arr[start+k] = mix[k];
        }
    }
}
