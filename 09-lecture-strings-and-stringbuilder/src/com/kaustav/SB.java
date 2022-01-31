//StringBuilder is a mutable version of String with a lot of inbuilt functions for operations such as delete, insert
package com.kaustav;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            //this will add "ch" at the last index of builder
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.deleteCharAt(0));
        System.out.println(builder.reverse());
    }
}
