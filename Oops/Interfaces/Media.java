package com.vishu.Oops.Interfaces;

public interface Media {
    void start();
    void stop();
    default void fun(){
        System.out.println("funny");
    }


}
