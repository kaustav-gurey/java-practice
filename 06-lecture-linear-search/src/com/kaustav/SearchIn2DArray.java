package com.kaustav;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(search(nums,9));
        System.out.println(search(nums,0));

        System.out.println(Arrays.toString(search2(nums,9)));
        System.out.println(Arrays.toString(search2(nums,0)));
    }
    //returns a boolean value
    static boolean search(int[][] arr, int target) {
        if(arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    //return the position of the target, if found
    static int[] search2(int[][] arr, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if(arr.length == 0) {
            return ans;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
