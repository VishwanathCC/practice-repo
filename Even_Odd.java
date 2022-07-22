package com.vishu;

import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("input a number: ");
        int n = In.nextInt();
        if (evenodd(n))
            System.out.println("even");
        else
            System.out.println("odd");

    }

    public static boolean evenodd(int k) {
        return (k % 2 == 0);
    }
}
