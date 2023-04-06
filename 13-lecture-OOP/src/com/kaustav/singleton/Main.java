package com.kaustav.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        //all teh outputs will be same because all the three reference variables
        //will point to one single object
        System.out.println(obj1.name);
        System.out.println(obj1.name);
        System.out.println(obj1.name);

        obj1.name = "Changed";

        //obj1.name is changed, but obj2.name and obj3.name will also be changed
        // because all teh reference variable point to the same object
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
