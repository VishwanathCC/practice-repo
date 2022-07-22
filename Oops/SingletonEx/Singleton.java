package com.vishu.Oops.SingletonEx;

public class Singleton {

    private Singleton (){
        System.out.println("tgerg");
    }

    public static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
