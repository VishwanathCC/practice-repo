package com.vishu.Sorting;

import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {
        int[] arr = {3,0,1};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] != i+1){
                swap(arr, i, arr[i]-1);
            }
        }
        return arr;
    }
    static int[] swap(int[] arr, int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        return arr;
    }
}
