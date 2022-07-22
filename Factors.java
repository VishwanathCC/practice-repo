package com.vishu;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Input a no.: ");
        int n = In.nextInt();
        for (int i=1; i<=n; i++)
            if (n % i == 0)
                System.out.print(i + ", ");
    }
}
