package com.vishu.Oops;

public class Constructors {
    public static void main(String[] args) {
//        Student Vishwa = new Student();
//        Vishwa.name = "Vishwanath Challal";
//        Vishwa.roll = 31;
//        System.out.println(Vishwa.name);
//        System.out.println(Vishwa.roll);
        Student Vinayak = new Student(14, "vcc", 34.9f);
        System.out.println(Vinayak.roll);
        Vinayak.greeting();
        Student obj;
        for (int i = 0; i < 1000000000; i++) {
//            obj = new Student();
        }
    }
}
