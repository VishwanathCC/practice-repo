package com.vishu;

public class Canjump {
    public static void main(String[] args) {
        int[] news = {2, 3, 1, 1, 4};
        System.out.println(canJump(news));

    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1){
            return true;
        }
        if (nums[0] == 0 && nums.length > 1)
            return false;

        int i =0;
        int sum = 0;
        while(sum < nums.length ){
            sum = sum + nums[i];

            if (sum >= nums.length)
                return true;
        }
        return false;
    }
}