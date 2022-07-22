package com.vishu.Oops.Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("start electric engine");
    }

    @Override
    public void stop() {
        System.out.println("stop electric engine");
    }
}
