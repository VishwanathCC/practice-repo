package com.vishu.Recursion;

public class Sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,5};
        int index = 0;
        System.out.println(sort(arr, index));
    }
    private static boolean sort(int[] arr, int i){
        if (i+1 == arr.length){
            return true ;
        }
            return arr[i] < arr[i+1] && sort(arr, i+1);
    }
}
