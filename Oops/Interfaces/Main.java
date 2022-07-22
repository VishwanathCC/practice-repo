package com.vishu.Oops.Interfaces;

public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar(new ElectricEngine());
        car.start();
        car.startMusic();
        car.fun();
    }
}
