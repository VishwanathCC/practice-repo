package com.vishu.Oops.access;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        A obj1 = new A(10, "sdf");
        A obj2 = new A(45, "ssrgdf");


//        obj1.num;
        System.out.println(Arrays.toString(obj1.arr));

        System.out.println(obj1.getName());


    }
}
