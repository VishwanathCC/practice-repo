package com.vishu.Sorting;

import java.util.Arrays;

public class Selection_sort{
    public static void main(String[] args) {
        int[] arr = {4,5,0,-86,1,2,3};

        System.out.println(Arrays.toString(Selection(arr)));
    }

    private static int[] Selection(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int last = arr.length-1-i;
            int maxIndex = maxmValue(arr, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    static int maxmValue(int[] arr,int end){
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static int[] swap(int[] arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
        return arr;
    }
}
