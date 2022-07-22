package com.vishu.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,-56,6,1,0};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j,j-1);
                }
                else
                    break;
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
