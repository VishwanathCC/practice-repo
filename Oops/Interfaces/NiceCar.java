package com.vishu.Oops.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media music = new Mediaplayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void startMusic() {
        music.start();
    }

    public void fun() {
        music.fun();
    }

}
