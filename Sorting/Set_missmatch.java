package com.vishu.Sorting;

import java.util.Arrays;

class Set_missmatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        ;
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int[] ans = {-1,-1};
        for(int i=0; i<nums.length; i++){
            while(i != nums[i]-1){
                if(nums[i] == nums[nums[i]-1]){
                    break;
                }                
                swap(nums, i, nums[i]-1);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i+1 != nums[i]){
                ans[0] = nums[i];
                ans[1] = i+1;
            }

        }
        return ans;
    }
    public static int[] swap(int[] arr,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }
}