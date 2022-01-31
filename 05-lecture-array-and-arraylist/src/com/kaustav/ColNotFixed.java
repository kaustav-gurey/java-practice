package com.kaustav;

public class ColNotFixed {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        //when the number of rows and columns of the array is not fixed
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
        }
    }
}
