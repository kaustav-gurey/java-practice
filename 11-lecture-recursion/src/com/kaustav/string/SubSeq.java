//explanation : https://www.youtube.com/watch?v=gdifkIwCJyg&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=31
package com.kaustav.string;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String s = "abc";
        //this will print all the subset of String s
        subSeq(s,"");

        String s1 = "xyzc";
        ArrayList<String> list = new ArrayList<>();
        list = subSeqReturn(s1,"");
        System.out.println(list);
    }

    //this will print all the subsets of s
    //we have to pass the required string as s and an empty string as p
    static void subSeq(String s, String p) {
        if(s.isEmpty()) {
            if(!p.isEmpty()) {
                System.out.println(p);
            }
            return;
        }
        char first = s.charAt(0);

        subSeq(s.substring(1),p+first);
        subSeq(s.substring(1),p);
    }
    //this will return an ArrayList with all the subsets of s
    static ArrayList<String> subSeqReturn(String s, String p) {
        ArrayList<String> list = new ArrayList<>();
        if(s.isEmpty()) {
            if(!p.isEmpty()) {
                list.add(p);
            }
            return list;
        }
        char first = s.charAt(0);

        ArrayList<String> left = subSeqReturn(s.substring(1),p+first);
        ArrayList<String> right = subSeqReturn(s.substring(1),p);

        list.addAll(left);
        list.addAll(right);

        return list;
    }
}
