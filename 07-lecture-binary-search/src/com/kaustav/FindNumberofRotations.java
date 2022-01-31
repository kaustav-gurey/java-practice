package com.kaustav;

public class FindNumberofRotations {
    public static void main(String[] args) {
        int[] nums = { 6,7,8,9,1,2,3,4,5};
        System.out.println(numberOfRotations(nums));

    }
    static int numberOfRotations(int[] arr) {
        if(arr[0]<arr[arr.length-1]) {
            return 0;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end) {
            int mid = start +((end-start)/2);
            if(mid>start && arr[mid]>arr[mid+1]) {
                return mid + 1;
            }
            if(mid<end && arr[mid]<arr[mid-1]) {
                return mid;
            }
            if(arr[mid]>arr[end]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return 0;
    }
}

