package com.vishu.Oops.SingletonEx;

public class Main {
    public static void main(String[] args) {
        Singleton rew = Singleton.getInstance();
        Singleton rte = Singleton.getInstance();
        Singleton req = Singleton.getInstance();
    }
}
