package com.kaustav;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        //will concatenate all the letters fro a-z to series
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series += ch;
        }
        /*here is every for loop new char is created and but it is not directly added to teh existing string because
        Strings are immutable thus a new String is also created and the old string and teh new char is copied and pasted
        in teh new String, this process is generating a lost of wasted memory thus this process is very inefficient,
        to do task like this we use StringBuilder, a mutable version of String*/
        System.out.println(series);
    }
}
