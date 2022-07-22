package com.vishu.Recursion;

public class Print_Nos {
    public static void main(String[] args) {
        int n = 5;
        pT(n);

    }

    private static void pT(int n) {
        if (n == 0) {
            return;
        }
        pT(n-1);
        System.out.print(n+" ");
    }
}
