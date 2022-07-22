package com.vishu.Recursion;

import java.util.ArrayList;

public class Find_Target_index {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,5,2,4};
        int target = 4;
        int index = 0;
        ArrayList<Integer> ans= new ArrayList<>();
        findAllIndex(arr, index,  target, ans);
        System.out.println(ans);
    }
    private static ArrayList<Integer> findAllIndex(int[] arr, int i, int t, ArrayList<Integer>ans){
        if (i == arr.length){
            return ans;
        }
        if(arr[i] == t){
            ans.add(i);
        }
        return findAllIndex(arr, i+1,  t, ans);
    }
}
