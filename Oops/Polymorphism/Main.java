package com.vishu.Oops.Polymorphism;

public class Main {
    @Override
    public String toString(){
        return "abc";
    }

    public static void main(String[] args) {
        Shapes obj1 = new Circle();
        Circle obj3 = new Circle();
        Shapes obj2 = new Shapes();

        obj1.area();
        obj2.area();
        obj3.area();

        System.out.println(obj2);

        Shapes.greeting();
//        obj3.greeting();


    }

}
