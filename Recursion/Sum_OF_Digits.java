package com.vishu.Recursion;

public class Sum_OF_Digits {
    public static void main(String[] args) {
        int n = 1234;
//        int ans = 0;
//        System.out.println(digits(n, ans));
        System.out.println(digits(n));

    }

//    private static int digits(int n,int ans) {
//        if(n<=0){
//            return ans;
//        }
//        ans += n%10;
//        return digits(n/10, ans);
//    }
    private static int digits(int n){
        if(n==0){
            return 0;
        }
        return (n%10 + digits(n/10));
    }
}

