package com.vishu;

public class Allarmstrong {
    public static void main(String[] args) {
        for (int i =100; i < 1000; i++)
            if (isArm(i)) {
                System.out.print(i+" ");
            }
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
