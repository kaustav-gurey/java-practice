//check if the array is sorted or not
package com.kaustav.arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isSorted(arr,0));

        int[] arr1 = {1, 2, 3, 4, 8, 5, 6, 7, 8, 9, 10};
        System.out.println(isSorted(arr1,0));
    }
    static boolean isSorted(int[] arr, int index) {
        //base condition if the index reached the last index that means the whole array is sorted
        if(index == arr.length-1) {
            return true;
        }
        /*will check if the element of the current index is less than or equal to the element of
        the next index and call the function on the rest of the array i.e check if teh remaining
        array is sorted or not*/
        //so teh
        return arr[index]<=arr[index+1] && isSorted(arr,index+1);
    }
}
