package com.vishu.String_Builder;

class Str_Str {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);

    }
}