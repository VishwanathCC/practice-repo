package com.vishu.Recursion;

public class Search_in_rotated_array {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        int target = 7;
        System.out.println(search(arr, target,0,arr.length-1));
    }
    private static int search(int[] arr, int target,int s, int e){
        int m = (s+e)/2;
        if (s>e){
            return -1;
        }
        if (target == arr[m]){
            return m;
        }
        if (arr[s]<=arr[m]){
            if (target >= arr[s] && target <= arr[m]){
                return search(arr, target,s,m-1);
            }else
                return search(arr, target,m+1,e);
        }
        if(target>=arr[m] && target <= arr[e]){
            return search(arr, target,m+1,e);
        }
        return search(arr, target,s,m-1);
    }
}
