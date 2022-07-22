package com.vishu;

public class Fib {
    public static void main(String[] args) {
        System.out.print("0, ");
        System.out.print("1, ");
        int p = 0;
        int i = 1;
        int c = 1;
        while (c < 18) {
            int temp = i;
            i = p + i;
            p = temp;
            System.out.print(i + ", ");
            c++;
        }
    }
}