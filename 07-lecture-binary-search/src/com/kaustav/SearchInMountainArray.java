package com.kaustav;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(findInMountainArray(4, nums));

    }
    static int findPeakElement(int[] arr) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start<end) {
            int mid = start + ((end-start)/2);
            if(arr[mid]<arr[mid+1]) {
                start = mid + 1;
            }
            else if(arr[mid]>arr[mid+1]) {
                end = mid;
            }
        }
        return end;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + ((end - start) / 2);

            if (target == arr[mid]) {
                return mid;
            }
            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int ans = -1;
        int max = findPeakElement(mountainArr);
        ans = orderAgnosticBS(mountainArr, target, 0, max);
        if(ans == -1) {
            ans = orderAgnosticBS(mountainArr, target, max - 1, mountainArr.length - 1);
        }

        return ans;
    }
}
