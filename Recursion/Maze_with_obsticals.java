package com.vishu.Recursion;

import java.util.Arrays;

public class Maze_with_obsticals {
    public static void main(String[] args) {
        boolean [][] g = new boolean[3][3];
//        g[1][2] = true;
//        mazerB(g, "", 0, 0);
//        mazerPath(g, "", 0, 0);
        int[][] path = new int[g.length][g[0].length];
        mazerPathPrint(g, "", 0, 0, path, 1);
    }
    static void mazerB(boolean [][] g,String p, int r, int c){
        if(r == g.length-1 && c == g[0].length-1){
            System.out.println(p);
            return;
        }
        if(g[r][c]){
            return;
        }
        if(r < g.length-1){
            mazerB(g, p+'D', r+1, c);
        }
        if(c < g[0].length-1){
            mazerB(g, p+'R', r, c+1);
        }
    }

    static void mazerPath(boolean [][] g,String p, int r, int c){
        if(r == g.length-1 && c == g[0].length-1){
            System.out.println(p);
            return;
        }
        if(g[r][c]){
            return;
        }
        g[r][c] = true;
        if(r < g.length-1){
            mazerPath(g, p+'D', r+1, c);
        }
        if (r > 0) {
            mazerPath(g, p+'U', r-1, c);
        }
        if(c < g[0].length-1){
            mazerPath(g, p+'R', r, c+1);
        }
        if (c > 0) {
            mazerPath(g, p+'U', r, c-1);
        }
        g[r][c] = false;
    }

    static void mazerPathPrint(boolean [][] g,String p, int r, int c, int[][] path, int step){
        if(r == g.length-1 && c == g[0].length-1){
            path [r][c] = step;
            for (int i = 0; i < path.length; i++) {
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(p);
            return;
        }
        if(g[r][c]){
            return;
        }
        g[r][c] = true;
        path [r][c] = step;

        if(r < g.length-1){
            mazerPathPrint(g, p+'D', r+1, c, path, step+1);
        }
        if (r > 0) {
            mazerPathPrint(g, p+'U', r-1, c, path, step+1);
        }
        if(c < g[0].length-1){
            mazerPathPrint(g, p+'R', r, c+1, path, step+1);
        }
        if (c > 0) {
            mazerPathPrint(g, p+'U', r, c-1, path, step+1);
        }
        g[r][c] = false;
        path [r][c] = 0;
    }

}
