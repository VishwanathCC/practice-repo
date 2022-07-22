package com.vishu.Arrays;

import java.util.Arrays;

class Sum_upto_zero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int k = n;
        for(int i=0; i<n/2; i++){
            arr[i] = k;
            k--;
        }
        int l = -n;
        for(int i=n-1; i>n/2; i--){
            arr[i] = l;
            l++;
        }
        if(n%2 != 0){
            arr[n/2] = 0;
        }
        return arr;
    }
}