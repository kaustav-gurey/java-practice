package com.kaustav.intro;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums,5,0,nums.length));
    }
    static int search(int[] nums, int target, int start, int end) {
        if(start<=end) {
            int mid = start +(end-start)/2;
            if(nums[mid]==target) {
                return mid;
            }
            if(nums[mid]>target) {
                return search(nums,target,mid+1,end);
            }
            else {
                return search(nums,target,start,mid-1);
            }
        }
        return -1;
    }
}
