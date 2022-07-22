package com.vishu;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("please enter a number to check whether it is Armstrong number or not: ");
        int n = In.nextInt();
        System.out.println(isArm(n));
    }

    static boolean isArm(int c){
        int num = c;
        int total = 0;
        while(c > 0){
            int rem = c%10 ;
            total = total + rem*rem*rem;
            c = c/10;
        }return total == num;
    }
}
