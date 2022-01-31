package com.kaustav.patterns;

public class Triangle {
    public static void main(String[] args) {
        triangle1(6,0);
        triangle2(6,0);
    }
    //print inverted right triangle
    //col has to be 0 and row has to be the number of rows
    static void triangle1(int row, int col) {
        if(row==0) {
            return;
        }
        //print a row
        if(row>col) {
            System.out.print("* ");
            triangle1(row, col+1);
        }
        //print a row is finished, go to the second row
        else{
            System.out.println();
            triangle1(row-1,0);
        }
    }
    //print right triangle
    //col has to be 0 and row has to be the number of rows
    static void triangle2(int row, int col) {
        if(row==0) {
            return;
        }
        //print a row
        if(row>col) {
            triangle2(row, col+1);
            System.out.print("* ");
        }
        //print a row is finished, go to the second row
        else{
            triangle2(row-1,0);
            System.out.println();
        }
    }
}
