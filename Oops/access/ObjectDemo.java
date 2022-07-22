package com.vishu.Oops.access;

public class ObjectDemo {
    int num;
    String name;

    ObjectDemo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {


        ObjectDemo obj1 = new ObjectDemo(10, "sdf");
        ObjectDemo obj2 = new ObjectDemo(10, "ssrgdf");

        if(obj1.equals(obj2)){
            System.out.println("true");
        }else
            System.out.println("false");

        System.out.println(obj1 instanceof ObjectDemo);

        System.out.println(obj2.getClass());
    }
}
