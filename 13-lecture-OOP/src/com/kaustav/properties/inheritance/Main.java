package com.kaustav.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.info();
        System.out.println();

        BoxWeight box2 = new BoxWeight();
        box2.info();
        System.out.println();

        //box three is an object whose reference type is of Box but the object
        // itself is of BoxWeight type
        //we can only use BoxWeight constructors while creating the object
        Box box3 = new BoxWeight(1,2,3,4);
        //this line will throw error because we can't access the weight variable
        //box3 because BoxWeight type object will have weight but the
        // reference type of the object is Box which does not have a weight member, the
        // weight member cannot be accessed
        //System.out.println(box3.weight);

        //we cannot access the weight function directly, but we can see its value using a method
        //if teh method with the same name is present in the parent class then only you can access
        // the method, but if you call teh method then the method in the child class will run
        box3.info();
        System.out.println();

        //testing out the copy constructor
        BoxWeight box4 = new BoxWeight(box2);
        box4.info();
        System.out.println();

        BoxPrice box5 = new BoxPrice(5, 10, 11);
        box5.info();

    }
}
