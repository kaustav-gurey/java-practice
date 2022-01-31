//sol 17 28 30 31
package com.kaustav;

public class Main {

    public static void main(String[] args) {
        // write your code here
        pattern1(5);
        System.out.println();

        pattern2(5);
        System.out.println();

        pattern3(5);
        System.out.println();

        pattern4(5);
        System.out.println();

        pattern5(5);
        System.out.println();

        pattern6(5);
        System.out.println();

        pattern7(5);
        System.out.println();

        pattern8(5);
        System.out.println();

        pattern9(5);
        System.out.println();

        pattern10(5);
        System.out.println();

        pattern11(5);
        System.out.println();
    }
    //star square
    static void pattern1(int rows) {
        for (int row = 0; row <rows; row++) {
            for (int col = 0; col < rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //star right angle triangle
    static void pattern2(int rows) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //star right angle triangle inverted
    static void pattern3(int rows) {
        for (int row = 0; row <rows; row++) {
            for (int col = 0; col < rows-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int rows) {
        for (int row = 0; row <rows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int rows) {
        for (int row = 0; row <rows/2 ; row++) {
            for (int col = 0; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(rows%2!=0) {
            for (int i = 0; i<=rows/2;i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row <rows/2; row++) {
            for (int col = 0; col < (rows/2)-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int rows) {
        for (int row = 0; row <rows; row++) {
            for (int col = 0; col <rows; col++) {
                if(row+col>=rows-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int rows) {
        for (int row = 0; row <rows; row++) {
            for (int col = 0; col <rows; col++) {
                if(col<row) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void pattern8(int rows) {
        int spaces = (rows-1);
        int stars = 1;
        for(int i = 0; i<rows; i++) {
            for (int s=0;s<spaces;s++) {
                System.out.print(" ");
            }
            for(int j = 0;j<stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars+=2;
            spaces--;
        }
    }
    static void pattern9(int rows) {
        int spaces = 0;
        int stars = (rows*2)-1;
        for(int i = 0; i<rows; i++) {
            for (int s=0;s<spaces;s++) {
                System.out.print(" ");
            }
            for(int j = 0;j<stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars-=2;
            spaces++;
        }
    }

    static void pattern10(int rows) {
        int spaces = rows-1;
        int stars = 1;
        for(int i = 0; i<rows; i++) {
            for (int s=0;s<spaces;s++) {
                System.out.print(" ");
            }
            for(int j = 0;j<stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            stars++;
            spaces--;
        }
    }
    static void pattern11(int rows) {
        int spaces = 0;
        int stars = rows;
        for(int i = 0; i<rows; i++) {
            for (int s=0;s<spaces;s++) {
                System.out.print(" ");
            }
            for(int j = 0;j<stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            stars--;
            spaces++;
        }
    }
}
