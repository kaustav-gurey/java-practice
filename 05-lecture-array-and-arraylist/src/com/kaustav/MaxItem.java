package com.kaustav;

public class MaxItem {
    public static void main(String[] args) {
        int[] nums = {45, 78, 56, 99, 101, 896};
        System.out.println(maxElement(nums));

    }
    static int maxElement(int[] arr) {
        if(arr.length==0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
