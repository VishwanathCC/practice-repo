package com.vishu.Recursion;

public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
//        Permute("", up);
        System.out.println(PermuteCount("", up));

    }

    private static void Permute(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i);
            Permute(f + ch + l, up.substring(1));
        }
    }
    private static int PermuteCount(String p, String up) {
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i);
            count += PermuteCount(f + ch + l, up.substring(1));
        }
        return count;
    }

}
