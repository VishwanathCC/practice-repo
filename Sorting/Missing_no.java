package com.vishu.Sorting;

public class Missing_no {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            while(arr[i] != i){
                if(arr[i] >= arr.length){
                    break;
                }
                swap(arr, i, arr[i]);
            }
        }

        for(int i=0; i<arr.length; i++){
            if(i != arr[i])
                return i;
        }
        return arr.length;
    }

    public static int[] swap(int[] arr, int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        return arr;
    }
}
