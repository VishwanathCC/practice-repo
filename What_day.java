package com.vishu;

import java.util.Scanner;

public class What_day {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int day = In.nextInt();
        String how = In.next();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> {
                System.out.println("Sunday");
                switch (how) {
                    case "n" -> System.out.println("wasted");
                    case "y" -> System.out.println("great");
                }
            }
            default -> System.out.println("enter valid day 1 to 7");
        }
    }
}
