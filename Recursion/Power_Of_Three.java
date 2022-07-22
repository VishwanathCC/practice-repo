package com.vishu.Recursion;

public class Power_Of_Three{
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPowerOfThree(n));
    }
        public static boolean isPowerOfThree(int n) {
            if (n==1)
                return true;
            else if (n==0)
                return false;
            else{
                long l =1;
                return isPowerOfn(n,l);
            }
        }

    private static boolean isPowerOfn(int n, long l) {
        if (l > n)
            return false;
        else if (l == n)
            return true;
        else{
            l = l*3;
            return isPowerOfn(n,l);
        }
    }
}
