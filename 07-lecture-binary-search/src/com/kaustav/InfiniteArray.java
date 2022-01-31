//applying BS on an array with infinite length

package com.kaustav;

public class InfiniteArray {
    public static void main(String[] args) {
        // write your code here
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(infiniteBinarySearch(nums,2));
        System.out.println(infiniteBinarySearch(nums,7));
        System.out.println(infiniteBinarySearch(nums,8));
        System.out.println(infiniteBinarySearch(nums,1));

    }
    static int[] findTheRange(int[] arr, int target) {
        int[] ans= new int[2];
        int start = 0,end =1;
        while(target>arr[end]) {
            int temp = start;
            start = end + 1;
            end =  start + ((end-temp)*2);
            ans[0] = start;
            ans[1] = end;
        }
        return ans;
    }

    static int infiniteBinarySearch(int[] arr, int target) {
        if(target == arr[0]) {
            return 0;
        }
        if(target == arr[1]) {
            return 1;
        }
        int[] range = new int[2];
        range = findTheRange(arr,target);
        int start = range[0], end = range[1];

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
