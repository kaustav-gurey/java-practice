package com.kaustav;

public class Comparison {
    public static void main(String[] args) {
        //here 'a' and 'b' point to the same object created in the string pool because both their values are same
        String a = "Kaustav";
        String b = "Kaustav";

        //this will be true because 'a' and 'b' point to the same object in string pool
        System.out.println(a==b);

        //here 'a1' and 'b1' have the same value but they will have separate objects because we are explicitly doing so
        String a1 = new String("Gurey");
        String b1 = new String("Gurey");

        //this will be false because even though both their values are same we explicitly created two different objects for 'a1' and 'b1'
        System.out.println(a1==b1);

        //if we only need to check the values of the String we can use ".equals()
        //this will just check teh value and not see if both teh variables point to teh same object
        System.out.println(a1.equals(b1));
    }
}
