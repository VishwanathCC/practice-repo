package com.vishu.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m =0;
        int[] nums2 = {1};
        int n =1;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            int i=m;
            int j=0;
            while (j<n && i<m+n){
                nums1[i] = nums2[j];
                j++;
                i++;
            }

        nums1 = BubbleSort(nums1);
        return nums1;
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
