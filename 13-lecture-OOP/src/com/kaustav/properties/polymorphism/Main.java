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

    }
}
