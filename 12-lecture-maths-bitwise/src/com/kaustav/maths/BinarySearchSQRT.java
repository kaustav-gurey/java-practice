//find the sqrt of a number without the predefined functions
package com.kaustav.maths;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        System.out.println(bsSqrt(36));
        System.out.println(bsSqrt(49));
        System.out.println(bsSqrt(10));
        System.out.println(bsSqrt(40));

        System.out.println();

        System.out.printf("%.3f \n",preciseBSSqrt(36,3));
        System.out.printf("%.3f \n",preciseBSSqrt(49,3));
        System.out.printf("%.3f \n",preciseBSSqrt(10,3));
        System.out.printf("%.3f \n",preciseBSSqrt(40,3));
    }
    //returns floor of teh square root if the number is not a perfect square
    //https://leetcode.com/problems/sqrtx/
    static int bsSqrt(int x) {
        int start = 1;
        int end = x;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<x/mid){
                start = mid+1;
            }
            else if(mid>x/mid){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
    //Time : O(logN)
    //p is for the maximum number of digits after teh decimal
    static double preciseBSSqrt(int n,int p) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(n/mid==n) {
                return (double)mid;
            }
            if(n/mid<mid) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
                root = mid;
            }
        }
        double incr = 0.1;
        for(int i=0; i<p; i++) {
            while(root*root<=n){
                if(root*root==n) {
                    return root;
                }
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
