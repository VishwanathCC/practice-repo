package com.vishu.Oops.AbstarctClasses;

public class Son extends Parent {

    public Son(int age) {
//        super(age);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("doctor");
        hello();
    }

    @Override
    void partner() {
        System.out.println("ww");
    }
}
