package com.vishu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner oprtr = new Scanner(System.in);
        System.out.print("enter operator type: ");
        char op = oprtr.next().charAt(0);
        int result = 0;

        if (op == '+' || op == '-' ||op == '*'|| op == '/' || op == '%' ){
            System.out.print("enter two numbers :");
            int num1 = oprtr.nextInt();
            int num2 = oprtr.nextInt();

            if (op == '+')
                result = num1 + num2 ;

            if (op == '-')
                result = num1 - num2 ;

            if (op == '*')
                result = num1 * num2 ;

            if (op == '/')
                result = num1 / num2 ;

            if (op == '%')
                result = num1 % num2 ;

            System.out.println("result is : " +result);
        }
        else{
            System.out.println("not a valid operator");
        }
    }
}
