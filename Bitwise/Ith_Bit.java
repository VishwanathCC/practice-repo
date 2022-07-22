package com.vishu.Bitwise;

public class Ith_Bit {
    public static void main(String[] args) {
        int y = 0b10110110;
        int i = 4;
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));
        int m = 1 << (i-1);
        System.out.println(Integer.toBinaryString(m));
        int k = y|m;
        System.out.println(Integer.toBinaryString(k));
    }
}
