package com.vishu.String_Builder;

public class Stringsssssss {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            a.append(ch);

        }
        System.out.println(a.toString());
//
//        a.deleteCharAt(3);
//        a.delete(3,7);
//        a.reverse();
        a.replace(2,4, "qwerty");
        System.out.println(a);
    }
}
