package com.kaustav.properties.polymorphism;

public class Shapes {
    public void area(){
        System.out.println("I am in Shapes");
    }

    //this code will throw error because final method cannot be overridden
    //which we have done in classes Circle Triangle and Square
//    final public void area(){
//        System.out.println("I am in Shapes");
//    }
}
