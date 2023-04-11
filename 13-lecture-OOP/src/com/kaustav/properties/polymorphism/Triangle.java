package com.kaustav.properties.polymorphism;

public class Triangle extends Shapes{
    //this will run when the object of Triangle is created
    //hence this will override the method in the parent class i.e. Shapes
    @Override  //this is called annotation
    public void area(){
        System.out.println("Area: half * base * height");
    }
}
