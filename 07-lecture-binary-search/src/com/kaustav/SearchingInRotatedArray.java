package com.kaustav;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchingInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(nums,5));
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if(mid>0 && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            else if(arr[mid]<=arr[start]) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start<=end) {
            int mid = start + (end-start)/2;
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
        return -1;
    }
    static int search(int[] nums, int target) {
        if(findPivot(nums)==-1) {
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(target>=nums[0]) {
            return binarySearch(nums,target,0,findPivot(nums));
        }
        return binarySearch(nums,target,findPivot(nums)+1,nums.length-1);
    }
}

