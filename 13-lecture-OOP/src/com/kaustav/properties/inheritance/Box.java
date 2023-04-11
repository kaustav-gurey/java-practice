package com.kaustav.properties.inheritance;

public class Box {
    double l;
    double b;
    double h;

    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box other){
        this.l = other.l;
        this.b = other.b;
        this.h = other.h;
    }
    public static void show(){
        System.out.println("I am in Box.");
    }
    public void info(){
        System.out.println("Running the box:");
        System.out.println("Length: " + this.l);
        System.out.println("Width: " + this.b);
        System.out.println("Height: " + this.h);
    }
}

