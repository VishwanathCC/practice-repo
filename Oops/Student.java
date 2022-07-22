package com.vishu.Oops;

public class Student {
    int roll;
    String name;
    float marks;
    public static int strength;

    void greeting() {
        System.out.println("Hello: " + name);
    }

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        Student.strength += 1;
    }

    Student() {
        roll = 12;
        name = "ef";
        marks = 98.9f;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("OBJ destroyeds");
    }
}
