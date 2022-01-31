package com.kaustav;

public class Greeting {
    public static void main(String[] args) {
        greeting();
        String personalied = myGreet("Kaustav");
        System.out.println(personalied);
    }

    static String myGreet(String name) {
        String message = "Hello " + name +'!';
        return message;
    }

    static void greeting() {
        System.out.println("Hello World!");
    }
}
