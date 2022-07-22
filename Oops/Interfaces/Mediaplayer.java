package com.vishu.Oops.Interfaces;

public class Mediaplayer implements Media{

    @Override
    public void start() {
        System.out.println("start player");
    }

    @Override
    public void stop() {
        System.out.println("stop player");
    }

    @Override
    public void fun() {
        System.out.println("hhhh");
    }


}
