package com.vishu.Recursion;

public class Count_Paths {
    public static void main(String[] args) {
        int r=3; int c=3;
        System.out.println(path(r,c));
    }
    static int path(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = path(r, c-1);
        int right = path(r-1, c);

        return left + right;
    }
}
