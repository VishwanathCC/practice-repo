package com.vishu.Arrays;

import java.util.Arrays;

class Spiral_Matrix_2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int k=0;
        while(k <= (k*k)){
            if(n==0){
                return arr;
            }
        for(int i=0; i<=0; i++){
            for(int j=0; j<n && k<=n; j++){
                k += 1;
                arr[i][j] = k;
            }
        }
        for(int i=1; i<n; i++){
            for(int j=n-1; j<n && k<=2*n; j++){
                k += 1;
                arr[i][j] = k;
            }
        }
        for(int i=n-1; i>=n-1; i--){
            for(int j=n-2; j>=0; j--){
                k += 1;
                arr[i][j] = k;
            }
        }
        for(int i=n-2; i>0; i--){
            for(int j=0; j<=0; j++){
                k += 1;
                arr[i][j] = k;
            }
        }
        n--;
        }
            return arr;
    }
}