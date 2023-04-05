package com.kaustav.introduction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student kaustav = new Student();
        System.out.println(kaustav);
        kaustav.name = "Kaustav Gurey";
        kaustav.rno = 60;
        kaustav.marks = 90.08f;
        kaustav.show();

        Student ben = new Student("Ben", 10, 100);
        ben.show();

        //copies all the values of ben using copy constructors
        Student kev = new Student(ben);
        kev.show();

        Student empty = new Student();
        empty.show();
    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student(){
        this("Default", 1, 100f);
    }
    Student(String name, int rno,  float marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
    //copy constructor
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    void show(){
        System.out.println("name : " + this.name);
        System.out.println("roll no : " + this.rno);
        System.out.println("marks : " + this.marks);
        System.out.println();
    }
}