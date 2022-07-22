package com.vishu.String_Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sub_Sequence {
    public static void main(String[] args) {
//        String word = "cde";
//        System.out.print(subSequence("", word));
//        subSeqascii("", word);
        int[] arr = {1,2,2};
        System.out.println(subsetDuplicate(arr));

    }

    static ArrayList<String> subSequence(String p, String s){

        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = subSequence(p+ch,s.substring(1));
        ArrayList<String> right = subSequence(p, s.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSeqascii(String p, String s){

        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);

        subSeqascii(p+ch,s.substring(1));
        subSeqascii(p+(ch + 0),s.substring(1));
        subSeqascii(p, s.substring(1));

    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
