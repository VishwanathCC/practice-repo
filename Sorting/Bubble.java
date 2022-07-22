package com.vishu.Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};

        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
    public static int[] BubbleSort(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                return arr;
        }
        return arr;
    }
}
