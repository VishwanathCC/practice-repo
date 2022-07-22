package com.vishu;

import java.util.Scanner;

public class CallFunctions {
    public static void main(String[] args) {

        int ans = sum();
        System.out.println(ans);

    }
     static int sum(){
        Scanner In = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = In.nextInt();
        System.out.print("enter num2: ");
        int num2 = In.nextInt();
        int sum = num2+num1;
        return sum;
    }
}
