package com.kaustav;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] d = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println(orderAgnosticBS(d,90));
        System.out.println(orderAgnosticBS(d,2));

        System.out.println();

        System.out.println(orderAgnosticBS(a,90));
        System.out.println(orderAgnosticBS(a,2));

    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            /*this is equivalent to (start+end)/2 but if the value of start and end
            are very high then there is a chance that start+end will exceed then max int value*/
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
}
