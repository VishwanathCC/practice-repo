package com.vishu.Oops.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human vi = new Human(25,"bsdf",false);
        Human vis = new Human(27,"bsedfdf",false);
        System.out.println(vi.population);
        System.out.println(vis.population);

        Main obj = new Main();
        obj.greeting();
    }

    void greeting(){
        System.out.println("hiii");
    }
}
