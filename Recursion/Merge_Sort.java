package com.vishu.Recursion;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        System.out.println(Arrays.toString(merge(arr)));
    }
    public static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int m =arr.length/2;

        int[] left = merge(Arrays.copyOfRange(arr,0,m));
        int[] right = merge(Arrays.copyOfRange(arr,m,arr.length));

        return merger(left, right);
    }

    private static int[] merger(int[] left, int[] right) {
        int[] mix = new int[left.length+ right.length];
        int i =0,j = 0,k = 0;

        while (i< left.length && j< right.length) {
            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i< left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
