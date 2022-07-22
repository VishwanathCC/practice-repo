package com.vishu.Sorting;


class Duplicatenos {
    public static void main(String[] args) {
        int[] arr= {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]-1 != i){
                if(arr[i] > arr.length){
                    break;
                }
                if(arr[i] == arr[arr[i]-1]){
                    break;
                }
                swap(arr, i, arr[i]-1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i+1 != arr[i])
                return i;
        }
        return n;
    }

    public static int[] swap(int[] arr, int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        return arr;
    }
}