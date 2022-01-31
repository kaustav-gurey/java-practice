package com.kaustav;

public class Conditionals {

    public static void main(String[] args) {
	    /*
        synatax of if-else
	        if(condition) {
	            statement;
            }
	        else if(condition) {
	            statement;
            }
	        else {
	            statement;
            }
	    */
        int salary = 27000;
        if(salary>20000) {
            salary += 2000;
        }
        else if(salary>10000) {
            salary += 1000;
        }
        else {
            salary += 100;
        }
        System.out.println(salary);
    }
}
