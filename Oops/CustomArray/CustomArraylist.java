package com.vishu.Oops.CustomArray;

import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public int size(){
        return this.size;
    }

    public void add(int num){
        data[size++] = num;
    }

    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    //    public void remove(){
//        data.size ==
//    }


    public static void main(String[] args) {
        CustomArraylist trial = new CustomArraylist();
        System.out.println(trial.size);
        trial.add(45);
        trial.add(88);
        System.out.println(trial.get(0));
        System.out.println(trial.size);
        System.out.println(trial);

    }
}
