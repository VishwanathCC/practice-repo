package com.vishu.Recursion;

public class Reverse {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(rev(n));
    }
    static int sum = 0;
    private static int rev(int n){
        if(n==0){
            return n;
        }
        sum = sum*10 + n%10;

        rev(n/10);
        if(sum <= Integer.MIN_VALUE || sum >= Integer.MAX_VALUE){
            return 0;
        }
        return sum;
    }
}
