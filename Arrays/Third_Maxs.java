package com.vishu.Arrays;

class Third_Maxs {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(max(nums));
    }

    public static int max(int[] nums){
        Integer max = null;
        Integer smax = null;
        Integer tmax = null;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
//            if (nums[i].equals(max) || nums[i].equals(smax) || nums[i].equals(tmax)) {
//                continue;
//            }

            if (num > max) {
                tmax = smax;
                smax = max;
                max = num;
            } else if (num > smax && num < max) {
                tmax = smax;
                smax = num;
            } else if (num > tmax && num < smax) {
                tmax = num;
            }
        }
        if(tmax == null){
            return max;
        }
        return tmax;
    }
}