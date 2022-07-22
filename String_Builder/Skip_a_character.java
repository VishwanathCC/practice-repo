package com.vishu.String_Builder;

public class Skip_a_character {
    public static void main(String[] args) {
        String str = "bcasad";
        String p = "";
        System.out.println(skipper(str, p));
    }
    private static String skipper(String s, String p){
        if (s.isEmpty()){
            return p;
        }
        char ch = s.charAt(0);
        if (ch == 'a'){
            return skipper(s.substring(1),p);
        }else
            return skipper(s.substring(1), p+ch);

    }
}
