package com.vishu.String_Builder;

class Reverse_Prefix {
    public static void main(String[] args) {
        String word = "abcdefd"; char ch = 'd';
        System.out.println(reversePrefix(word, ch));

    }
    public static String reversePrefix(String word, char ch) {
        String pre = word.substring(0, word.indexOf(ch)+1);
        String suf = word.substring(word.indexOf(ch)+1, word.length());
        StringBuilder res = new StringBuilder(pre);
        res.reverse();
        res.append(suf);
        return res.toString();

    }
}