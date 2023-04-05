package com.kaustav.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kaustav = new Human(21, "Kaustav", 0, false);
        kaustav.display();
        System.out.println(Human.population);
    }
}
