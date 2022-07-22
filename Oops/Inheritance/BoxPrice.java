package com.vishu.Oops.Inheritance;

public class BoxPrice extends BoxWeight{
    int cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(int cost){
        this.cost = cost;
    }

    BoxPrice (BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l, double w, double h, double weight, int cost){
        super(l,w,h,weight);
        this.cost = cost;
    }

    BoxPrice(double l, double w, double h, int cost){
        super(l,w,h);
        this.cost = cost;
    }

}
