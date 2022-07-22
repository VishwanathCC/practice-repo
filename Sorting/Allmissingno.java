package com.vishu.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Allmissingno {
    public static void main(String[] args) {
        int[] arr= {1,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]-1 != i){
                if(arr[i] > arr.length){
                    break;
                }
                if(arr[i] == arr[arr[i]-1]){
                    break;
                }
                swap(arr, i, arr[i]-1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i+1 != arr[i])
                ans.add(i+1);
        }
        // ans.add(arr.length);
        return ans;
    }

    public static int[] swap(int[] arr, int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        return arr;
    }
}