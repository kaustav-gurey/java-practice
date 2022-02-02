package com.kaustav.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));

        System.out.println();

        printULPaths(2,2,"");

        System.out.println();

        ArrayList<String> sol = new ArrayList<>();
        sol = returnULPaths(2,2,"");
        System.out.println(sol);

        System.out.println();

        ArrayList<String> sol1 = new ArrayList<>();
        sol1 = returnULDiaPaths(2,2,"");
        System.out.println(sol1);

        System.out.println();

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        printULPathsRestrictions(board,2,2,"");
    }
    //we have to reach (0,0) by going only down and right
    //return the number of possible paths
    //r and c is the index of the row and colum we are starting from
    static int countPaths (int r, int c) {
        /*if the counter is on the 1st column or row then from there, there is only one way to reach the
         goal since we are restricted by the going only up and left*/
        if(r == 0 || c == 0) {
            return 1;
        }
        //left is the number of paths the counter can take after going left
        int left = countPaths (r,c-1);
        //up is the number of paths the counter can take after going up
        int up = countPaths (r-1, c);

        /*return (the number of paths the counter can take after taking the first step as left + the number
        of paths the counter can take after taking the first step as up) i.e the total number of possible steps*/
        return left+up;
    }
    //we have to reach (0,0) by going only down and right
    //print the possible paths
    //r and c is the index of the row and colum we are starting from
    static void printULPaths(int r, int c, String path) {
        //return path if the counter is in (1,1) i.e. the required position
        if(r == 0 && c == 0) {
            System.out.println(path);;
        }
        //if the counter is not on the last row move one step down and "D" to path
        if(r>0) {
            printULPaths(r-1,c,"U"+path);
        }
        //if the counter is not on the rightmost column move one step right and add "R" tp path
        if(c>0) {
            printULPaths(r,c-1,"L"+path);
        }
    }
    // we have to reach (0,0) by going only down and right
    //return the possible paths
    //r and c is the index of the row and colum we are starting from
    static ArrayList<String> returnULPaths(int r, int c, String path) {
        ArrayList<String> list = new ArrayList<>();
        //add path to the list and return the list if the counter is in (1,1) i.e. the required position
        if(r == 0 && c == 0) {
            list.add(path);
            return list;
        }
        /*if the counter is not on the last row move one step down and "D" to path and add all
        the possible paths from that point in list*/
        if(r>0) {
            list.addAll(returnULPaths(r-1,c,"U"+path));
        }
        /*if the counter is not on the rightmost column move one step right and add "R" to path and add all
        the possible paths from that point in list*/
        if(c>0) {
            list.addAll(returnULPaths(r,c-1,"L"+path));
        }
        return list;
    }
    // we have to reach (1,1) by going only down and right and diagonally down-right
    //imagine the matrix to be inverted on x-axis then on y-axis
    //return the possible paths
    //r and c is the index of the row and colum we are starting from
    static ArrayList<String> returnULDiaPaths(int r, int c, String path) {
        ArrayList<String> list = new ArrayList<>();
        //add path to teh list and return teh list if the counter is in (1,1) i.e. the required position
        if(r == 0 && c == 0) {
            list.add(path);
            return list;
        }
        /*if the counter is not on the last row move one step down and "D" to path and add all
        the possible paths from that point in list*/
        if(r>0) {
            list.addAll(returnULDiaPaths(r-1,c,"U"+path));
        }
        /*if the counter is not on the rightmost column move one step right and add "R" to path and add all
        the possible paths from that point in list*/
        if(c>0) {
            list.addAll(returnULDiaPaths(r,c-1,"L"+path));
        }
        /*if the counter is not on the rightmost column and not on last row move one step diagonally right-down
        and add "d" to path and add all the possible paths from that point in list*/
        if(c>0 && r>0) {
            list.addAll(returnULDiaPaths(r-1,c-1,"d"+path));
        }
        return list;
    }
    //we have to reach (0,0) by going only up and left avoiding all teh restrictions i.e. false in the matrix
    //print the possible paths
    //r and c is the index of the row and colum we are starting from and maze is the given matrix
    static void printULPathsRestrictions(boolean[][] maze, int r, int c, String path) {
        //return path if the counter is in (1,1) i.e. the required position
        if(r == 0 && c == 0) {
            System.out.println(path);;
        }
        if(!maze[r][c]) {
            return;
        }
        //if the counter is not on the last row move one step down and "D" to path
        if(r>0) {
            printULPathsRestrictions(maze,r-1,c,"U"+path);
        }
        //if the counter is not on the rightmost column move one step right and add "R" tp path
        if(c>0) {
            printULPathsRestrictions(maze,r,c-1,"L"+path);
        }
    }
}
