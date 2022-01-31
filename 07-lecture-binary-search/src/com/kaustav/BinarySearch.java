package com.kaustav;

public class BinarySearch {

    public static void main(String[] args) {
        // write your code here
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {1};
        System.out.println(binarySearch(nums,2));
        System.out.println(binarySearch(nums,78));

        System.out.println(binarySearch(nums2,78));
        System.out.println(binarySearch(nums2,1));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            /*this is equivalent to (start+end)/2 but if the value of start and end
            are very high then there is a chance that start+end will exceed then max int value*/
            int mid = start + ((end - start) / 2);

            if(target == arr[mid]) {
                return mid;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
