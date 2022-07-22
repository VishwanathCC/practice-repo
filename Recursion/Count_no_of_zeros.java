package com.vishu.Recursion;

public class Count_no_of_zeros {
    public static void main(String[] args) {
        int g = 20408;
        System.out.println(countt(g));
    }
    static int count = 0;
    public static int countt(int n){
        if (n == 0){
            return count;
        }
        if (n%10 == 0){
            count++;
        }
        countt(n/10);
        return count;
    }
}
