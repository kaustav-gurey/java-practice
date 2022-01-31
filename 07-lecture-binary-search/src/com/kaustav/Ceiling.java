package com.kaustav;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 4, 5, 7, 8, 9, 10, 12, 13};

        System.out.println(ceiling(nums,6));
        System.out.println(ceiling(nums,9));
        System.out.println(ceiling(nums,2));
        System.out.println(ceiling(nums,11));


    }
    // Q. The smallest element in array greater than or equal to the target
    //array has to be sorted
    static int ceiling(int arr[], int target) {
        if(arr.length == 0) {
            return -1;
        }
        if(arr[arr.length-1]<target) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while(start<=end) {
            int mid = start + ((end- start)/2);
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid]>target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
