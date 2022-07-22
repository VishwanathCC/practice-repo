package com.vishu.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_paths {
    public static void main(String[] args) {
        int r=3; int c=3;
//        pathret("", r, c);   System.out.println("");
//        System.out.println(pathretAr("", r, c));
        System.out.println(pathDiagonal("", r, c));

    }
    static void pathret(String p,int r, int c){
        if(r==1 && c==1){
            System.out.print(p+"  ");
            return;
        }
        if (r>1){
            pathret(p+'D',r-1, c);

        }
        if (c>1){
            pathret(p+'R', r,c-1);

        }
    }

    static ArrayList<String> pathretAr(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list= new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> l= new ArrayList<String>();

        if (r>1){
            l.addAll(pathretAr(p+'D',r-1, c));
        }
        if (c>1){
            l.addAll(pathretAr(p+'R', r,c-1));
        }
        return l;
    }

    static ArrayList<String> pathDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list= new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> l= new ArrayList<String>();

        if (r>1){
            l.addAll(pathretAr(p+'V',r-1, c));
        }
        if (r>1 && c>1){
            l.addAll(pathretAr(p+'D',r-1, c-1));
        }
        if (c>1){
            l.addAll(pathretAr(p+'H', r,c-1));
        }
        return l;
    }

}
