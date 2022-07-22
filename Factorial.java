package com.vishu;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Input a number: ");
        int fact = ip.nextInt();

//      for (int i = fact ; i >2 ; i--)
//          fact = fact*(i-1);

//Both the upper and lower for loops give same results. run anyone.

        int temp = fact;
        for (int i = 2; i < fact; i++) {
            temp = temp*i;
        }
        System.out.println(temp);
    }
}
