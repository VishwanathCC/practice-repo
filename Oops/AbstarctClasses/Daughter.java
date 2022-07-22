package com.vishu.Oops.AbstarctClasses;

public class Daughter extends Parent{

    public Daughter(int age) {
//        super(age);
        this.age = age;

    }

    @Override
    void career() {
        System.out.println("president");
    }

    @Override
    void partner() {
        System.out.println("engg");
    }
}
