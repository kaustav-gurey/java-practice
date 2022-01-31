//searching in fully sorted 2D matrix
package com.kaustav;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        System.out.println(Arrays.toString(search(arr,7)));
    }
    static int[] bs(int[][] matrix,int row, int target) {
        int start = 0;
        int end = matrix[row].length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(matrix[row][mid]==target) {
                return new int[]{row,mid};
            }
            else if(matrix[row][mid]<target) {
                start = mid +1;
            }
            else {
                end = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target) {
        int[] invalid = {-1,-1};
        int start = 0;
        int end = matrix.length -1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            int[] ans = new int[2];
            ans = bs(matrix, mid, target);
            if (!Arrays.equals(ans,invalid)) {
                return bs(matrix, mid, target);
            }
            if(matrix[mid][0]>target) {
                end = mid-1;
            }
            else if(matrix[mid][matrix[mid].length-1]<target){
                start = mid+1;
            }
            else {
                return invalid;
            }
        }
        return invalid;
    }
}
