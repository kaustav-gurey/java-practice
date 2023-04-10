package com.kaustav.singleton;

public class Singleton {
    String name = "Unique";
    //this will make sure the constructor cannot be called outside this class
    //thus no unwanted objects of this class is created
    private Singleton(){

    }

    //this will create an instance of the Singleton class where we will store our
    //singular object and because its value will remain constant we will declare it as static
    private static Singleton instance;

    //this function will crete an object of the class and store it in instance and then return the
    //instance, but if instance is not null i.e. an object has already been created and stored in
    //instance then it will not create a new object and return the old instance itself
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
