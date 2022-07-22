package com.vishu.String_Builder;

class Shortest_Palindrome {
    public static void main(String[] args) {
        String s = "aacecaaa";
        System.out.println(shortestPalindrome(s));
    }
    public static String shortestPalindrome(String s) {
        char ch = s.charAt(0);
        int  i = s.indexOf(ch, 1);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        i++;
        while(i<s.length()){
            sb.insert(0,s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}