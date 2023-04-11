package com.kaustav.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.area();
        System.out.println();
        circle.area();
        System.out.println();
        triangle.area();
        System.out.println();
        square.area();
        System.out.println();

        //reference variable of the parent class and teh object of child class
        //this is called Upcasting
        Shapes bleh = new Circle();
        //this method will be called based on the object type not the reference type
        bleh.area();

        //this line will throw error because even though the methods of the class of
        //the type of object, in this case Circle is called, the methods have to be
        //present in the class of the reference type, in this case Shapes to be called
        //bleh.area2();

    }
}
