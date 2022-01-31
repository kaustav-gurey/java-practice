package com.kaustav;

public class SortingInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearchInf(nums,5,0,1));
        System.out.println();
        System.out.println(binarySearchInf(nums,6,2,3));
    }
    static int binarySearchInf(int[] arr, int target, int start, int end) {
        while(start<=end) {
            int mid = start + ((end-start)/2);
            if(arr[end]<target) {
                int newStart = end + 1;
                end = end + (2 * (end-start+1));
                start = newStart;
            }
            else if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] > target) {
                end = target - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
