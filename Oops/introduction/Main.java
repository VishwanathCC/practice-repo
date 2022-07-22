package com.vishu.Oops.introduction;

public class Main {
    public static void main(String[] args) {
        Student vishwa = new Student();
        System.out.println(vishwa.name);
        vishwa.rollno = 44;
        vishwa.marks = 88.45f;
        System.out.println(vishwa.rollno);
        System.out.println(vishwa.marks);
        Student vishw = new Student(34, "erferf", 97.34f);
        System.out.println(vishw.marks);
        vishw.greeting();
        Student vishwanath = new Student(vishw);
        System.out.println(vishwanath.name);
        Integer a = 10;

        Student obj;
        for (int i = 0; i<10_00_000; i++){
            obj = new Student();
        }
    }
}

class Student{
    int rollno;
    String name;
    float marks = 45;

//    Student (){
//        this.rollno = 10;
//        this.name = "yor goddamn name";
//        this.marks = 50.0f;
//    }

    Student (){
        this (10, "yor goddamn name", 50.0f);
    }

    void greeting (){
        System.out.println("Hekk my name is: "+ this.name);
    }

    Student (int rn, String nm, float tgh){
        this.rollno = rn;
        this.name = nm;
        this.marks = tgh;
    }

    Student (Student old){
        this.rollno = old.rollno;
        this.name = old.name;
        this.marks = old.marks;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("objects destroyed");
    }
}