package com.vishu.Recursion;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr, int low, int hi) {
        if(low >= hi){
            return ;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;

        while(s<=e){
            while(arr[s] < arr[m]){
                s++;
            }
            while(arr[e] > arr[m]){
                e--;
            }
            if (s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++; e--;
            }
        }
        quick(arr, low, e);
        quick(arr, s, hi);
    }
}
