package com.vishu.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greates_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));


    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_candies = maxCandies(candies);
        ArrayList<Boolean> List = new ArrayList<Boolean>();
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= max_candies)
                List.add(true);
            else
                List.add(false);
        }
        return List;
    }

    public static int maxCandies(int[] candies){
        int max = 0;
        for(int i=0; i<candies.length; i++){
            if(max < candies[i])
                max = candies[i];
        }
        return max;
    }
}
