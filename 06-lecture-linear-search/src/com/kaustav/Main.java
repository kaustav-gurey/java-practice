package com.kaustav;

public class Main {

    public static void main(String[] args) {

        int[] nums = {12, 56 ,89, 9 ,67, 90, 10};
        System.out.println(linearSearch(nums,900));
    }
    //linear search: return the index if the number if the number is found else return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
