package com.vishu.Oops.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj1 = new SubClass(3,"eirg");
        SubClass obj2 = new SubClass(3,"eirg");

        if(obj1.equals(obj2)){
            System.out.println("wef");
        }else
            System.out.println("ertyuio");

        int n = obj1.num;
        System.out.println(n);
        System.out.println(obj1);
    }

    @Override
    public String toString() {
        return "dfgdg";
    }
}

