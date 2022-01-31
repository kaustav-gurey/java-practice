package com.kaustav;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {45, 78, 9, 78, 34};
        System.out.println(minimum(nums));
        int[] nums2 = new int[0];
        System.out.println(minimum(nums2));
    }
    static int minimum(int[] arr) {
        if(arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

