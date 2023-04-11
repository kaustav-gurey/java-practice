package com.kaustav.properties.polymorphism;

public class Circle extends Shapes{
    //this is called annotation, this will throw error the method is not
    //correctly overriding, it is used as a check for overriding
    @Override
    //this will run when the object of Circle is created
    //hence this will override the method in the parent class i.e. Shapes
    public void area(){
        System.out.println("Area: pie * radius * radius");
    }
    public void area2(){
        System.out.println("I am in Circle");
    }
}
