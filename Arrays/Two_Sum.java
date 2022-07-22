package com.vishu.Arrays;

import java.util.Arrays;

class Two_Sum {
    public static void main(String[] args) {
        int [] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
       int[] ans = new int[2];
       for(int i=0; i<nums.length; i++){
           if(nums[i] <= target){
               for(int j=i+1; j<nums.length; j++){
                   if(nums[i] + nums[j] == target){
                       ans = new int[]{i, j};
                   }
               }
           }
       }
        return ans;
    }
}
