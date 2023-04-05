package com.kaustav.packages;

//import statement to access the message() method in a different class
import static com.kaustav.packages.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //this method is in a different class, but we can access it with the import statement in line 4
        message();
    }
}
