package com.kaustav;
//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArraySum {
    public static void main(String[] args) {

    }
    static int splitArray(int[] nums, int m) {
        int start = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);      //maxmimum element of ethe array
            end += nums[i];                       //summation of the elements of teh array
        }
        //binary search
        while(start<end) {
            int mid = start + (end-start)/2;
            int pieces = 1;
            int sum = 0;
            for(int num : nums) {
                if(sum+num>mid) {
                    sum = num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }
            if(pieces>m) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return end;   //here start == end
    }
}
