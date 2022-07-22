package com.vishu.String_Builder;

class Halves_are_Alike {
    public static void main(String[] args) {
        String s = "AbCdEfGh";
        System.out.println(halvesAreAlike(s));

    }
    public static boolean halvesAreAlike(String s) {

        String f = s.substring(0, s.length()/2).toLowerCase();
        int countf =1;
        String e = s.substring(s.length()/2, s.length()).toLowerCase();
        int counte =1;

        for (int i = 0; i < f.length(); i++) {
            if(f.charAt(i) == 'a' || f.charAt(i) == 'e' || f.charAt(i) == 'i' || f.charAt(i) == 'o' || f.charAt(i) == 'u'){
                countf++;
            }
            if(e.charAt(i) == 'a' || e.charAt(i) == 'e' || e.charAt(i) == 'i' || e.charAt(i) == 'o' || e.charAt(i) == 'u'){
                counte++;
            }
        }
        return counte == countf;
    }
}