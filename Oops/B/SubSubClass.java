package com.vishu.Oops.B;

import com.vishu.Oops.access.A;
import com.vishu.Oops.access.SubClass;

public class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj1 = new SubSubClass(7,"eirg");
        SubSubClass obj2 = new SubSubClass(5,"eitgrg");

        int n = obj1.num;
        System.out.println(n);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



}


