package com.vishu.Sorting;

class First_Missing_positive {
    public static void main(String[] args) {
        int[] arr= {1,1};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] != i+1){
                if(arr[i] > arr.length || arr[i] <= 0){
                    break;
                }
                if(arr[i] == arr[arr[i]-1]) {
                    break;
                }
                swap(arr, i, arr[i]-1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i+1 != arr[i])
                return i+1;
        }
        return arr.length+1;
    }

    public static int[] swap(int[] arr, int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        return arr;
    }
}