package com.kaustav.backtracking;

import java.util.Arrays;

public class AllSteps {
    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allSteps(board,0,0,"");

        int[][] ans = new int[board.length][board[0].length];

        allStepsPrintPath(board, ans, 0, 0, "", 1);

    }
    static void allSteps(boolean[][] maze, int r, int c, String path) {
        if(r==maze.length-1 && c==maze[0].length-1) {
            System.out.println(path);
        }
        //if maze[r][c] is false then the counter won't go this way thus there will be no path
        if(!maze[r][c]) {
            return;
        }
        //so that the counter doesn't come back to the same location that it came from we will set it false
        maze[r][c] = false;
        //if the counter is not in the last row move down
        if(r<maze.length-1) {
            allSteps(maze, r + 1, c,'D'+path);
        }
        //if the counter is not in the first row move up
        if(r>0) {
            allSteps(maze,r - 1,c,'U'+path);
        }
        //if the counter is not in the last column move right
        if(c<maze[0].length-1) {
            allSteps(maze, r, c + 1, 'R' + path);
        }
        //if the counter is not in the first column move left
        if(c>0) {
            allSteps(maze, r, c - 1, 'L' + path);
        }
        //after all the operation make the location true for the future recursions not to ignore it
        maze[r][c] = true;
    }
    static void allStepsPrintPath(boolean[][] maze,int[][] sol, int r, int c, String path,int step) {
        if(r==maze.length-1 && c==maze[0].length-1) {
            sol[r][c] = step;
            for(int[] arr : sol) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;
        }
        //if maze[r][c] is false then the counter won't go this way thus there will be no path
        if(!maze[r][c]) {
            return;
        }
        //so that the counter doesn't come back to the same location that it came from we will set it false
        maze[r][c] = false;
        //put the step number in teh location
        sol[r][c] = step;
        //if the counter is not in the last row move down
        if(r<maze.length-1) {
            allStepsPrintPath(maze, sol, r + 1, c, path + 'D', step + 1);
        }
        //if the counter is not in the last column move right
        if(c<maze[0].length-1) {
            allStepsPrintPath(maze, sol, r, c + 1,  path + 'R', step + 1);
        }
        //if the counter is not in the first row move up
        if(r>0) {
            allStepsPrintPath(maze, sol, r - 1,c, path + 'U', step + 1);
        }
        //if the counter is not in the first column move left
        if(c>0) {
            allStepsPrintPath(maze, sol, r, c - 1,  path + 'L', step + 1);
        }
        //after all operations make the sol location 0 for the future recursion calls
        sol[r][c] = 0;
        //after all the operation make the location true for the future recursions not to ignore it
        maze[r][c] = true;
    }
}
