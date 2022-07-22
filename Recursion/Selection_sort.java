package com.vishu.Recursion;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int i=arr.length; int j = 0; int max =0;
        selection(arr, i, j, max);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr, int i, int j, int max){
        if(i == 0){
            return;
        }
        if (j<i){
            if(arr[j] > arr[max]){
                selection(arr, i, j+1, j);
            }else
                selection(arr, i, j+1, max);
        }
        else{
            int temp = arr[max];
            arr[max] = arr[i-1];
            arr[i-1] = temp;
            selection(arr, i-1,0,0);
        }
    }
}