package com.kaustav.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kaustav = new Human(21, "Kaustav", 0, false);
        kaustav.display();
        System.out.println(Human.population);

        //we can call fun() because it is a static method
        fun();
        //we cannot call greeting() because it is a non-static method
        //greeting();

        //we can call fun like this also
        Main.fun();

        Main obj = new Main();
        //to call greeting we had to create an object first because
        // non-static methods depends on objects
        obj.greeting();

    }
    //we know that this non-static method belongs to the object so, we can't call it in main
    void greeting(){
        System.out.println("Hello World!");
    }

    static void fun(){
        System.out.println("This is fun");
        //we can't call greeting because greeting is not static thus depends on teh object
        //while fun which is a static method does not depend on the object
        //greeting();
    }
}
