package com.vishu;


import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {4,45,4,7};
        int[] ans=new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length; i<2*(nums.length); i++){
            ans[i]=nums[j];
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
