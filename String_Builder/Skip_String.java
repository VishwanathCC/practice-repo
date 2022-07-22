package com.vishu.String_Builder;

public class Skip_String {
    public static void main(String[] args) {
        String str = "bcappesad";
        String p = "";
        System.out.println(skipper(str, p));
    }
    private static String skipper(String s, String p){
        if (s.isEmpty()){
            return p;
        }
        char ch = s.charAt(0);
        if (s.startsWith("apple")){
            return skipper(s.substring(5),p);
        }else
            return skipper(s.substring(1), p+ch);

    }
}