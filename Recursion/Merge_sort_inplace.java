package com.vishu.Recursion;

import java.util.Arrays;

public class Merge_sort_inplace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeInplace(int[] arr, int s, int e){
        if(e-s == 1){
            return ;
        }
        int m =(s+e)/2;

        mergeInplace(arr,s,m);
        mergeInplace(arr,m,e);

        mergerInplace(arr,s,e,m);
    }
    private static void mergerInplace(int[] arr, int s, int e, int m) {
        int[] mix = new int[e-s];
        int i =s,j = m,k = 0;

        while (i< m && j< e) {
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i< m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, s + 0, mix.length);
    }
}
