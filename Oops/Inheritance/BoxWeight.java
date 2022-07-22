package com.vishu.Oops.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double weight){
        this.weight = weight;
    }

    BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    BoxWeight(double l, double w, double h) {
        super(l, w, h);
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

}
