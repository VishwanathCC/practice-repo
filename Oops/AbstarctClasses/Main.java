package com.vishu.Oops.AbstarctClasses;

import static com.vishu.Oops.AbstarctClasses.Parent.hello;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34);
        son.career();
//        hello();

        Daughter dau = new Daughter(23);
        dau.partner();
    }
}
