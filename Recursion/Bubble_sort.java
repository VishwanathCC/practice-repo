package com.vishu.Recursion;
import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int i=arr.length-1; int j = 0;
        bubble(arr, i,j);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr, int i, int j) {
        if(i == 0){
            return;
        }
        if (i > j){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];                  //swap
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubble(arr, i, j+1);
        }else {
            bubble(arr, i-1, 0);
        }
    }
}
