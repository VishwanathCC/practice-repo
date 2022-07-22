package com.vishu;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        char C = In.next().charAt(0);

        if (C >= 97 && C <= 122)
            System.out.println("lower case");
        else
            System.out.println("upper case");
    }
}
