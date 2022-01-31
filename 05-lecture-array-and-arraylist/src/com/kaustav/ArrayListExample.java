package com.kaustav;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Syntax
        //in the first brackets we cannot pass primitive datatypes, we always have to pass wrapper classes
        ArrayList<Integer> list = new ArrayList<>(10);   //here 10 is an initial size, we can put more values than 10 in the Arraylist//adds the item to the first location that the compiler finds empty
        list.add(60);
        list.add(61);
        list.add(62);
        list.add(63);
        list.add(64);
        list.add(65);
        list.add(66);

        System.out.println(list.get(3));   //prints the index 3 element of the Arraylist
        System.out.println(list);  //prints the list

        list.set(0,100);    //updates the 0th element to 100
        System.out.println(list);

        System.out.println(list.contains(9));  //checks if the value is in the list and returns a boolean

        list.remove(4); //removes element in 4th index
        System.out.println(list);

        //for printing he Arraylist using for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //taking all the inputs from the user in an Arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(input.nextInt());
        }

        System.out.println(list1);
    }

}
