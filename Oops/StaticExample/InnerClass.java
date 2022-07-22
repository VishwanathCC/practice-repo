package com.vishu.Oops.StaticExample;

public class InnerClass {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "not apllicable for objects";
        }
    }

    public static void main(String[] args) {
        Test re = new Test("hahhaha");
        Test we = new Test("hehehe");
        System.out.println(re.name);
        System.out.println(we.name);
        System.out.println(re);
    }
}
