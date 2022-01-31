package com.kaustav.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 4, 3, 1, 9, 3};
        int sol = ans(arr);
        System.out.println(sol);
    }
    static int ans(int[] arr) {
        int unique = 0;
        System.out.println(unique);
        for(int n : arr) {
            unique ^= n;
            System.out.println(unique);
        }
        return unique;
    }
}
