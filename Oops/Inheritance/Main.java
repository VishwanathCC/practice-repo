package com.vishu.Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        System.out.println(box1.l+" "+ box1.w+" "+ box1.h);
        System.out.println(box2.l+" "+ box2.w+" "+ box2.h);


        BoxWeight box3 = new BoxWeight(7,2,3,40);
        System.out.println(box3.l+" "+ box3.w+" "+ box3.h+" "+ box3.weight);

        Box box4 = new BoxWeight(5,3,4,80);
        System.out.println(box4.w);

//        BoxWeight box5 = new Box(5,3,4);
//        System.out.println(box5.l);

        BoxPrice box6 = new BoxPrice(3,4,5,6,700);
        System.out.println(box6.l+" "+box6.w+" "+box6.h+" "+box6.weight+" "+box6.cost);





    }
}
