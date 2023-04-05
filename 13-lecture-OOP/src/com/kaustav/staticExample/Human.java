package com.kaustav.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static  int population = 0;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population += 1;
    }

    public void display(){
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("salary : " + this.salary);
        System.out.println("married : " + this.married);
    }

}
