package com.kaustav.staticExample;
//we cannot declare this outer class which is ironically named innerclass to static
public class OuterClass {
    //this class is static which means it does not depend on the object of
    //the OuterClass, thus we can create objects of the InnerClass without
    //creating an object for the OuterClass
    static class InnerClass{
        String name;
        public InnerClass(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        //we can create objects of InnerClass wihtout creating objects
        //of OuterClass because InnerClass is static
        InnerClass kev = new InnerClass("Kevin");
        InnerClass ben = new InnerClass("Ben");

        System.out.println(kev.name);     //Kevin
        System.out.println(ben.name);     //Ben
    }
}
