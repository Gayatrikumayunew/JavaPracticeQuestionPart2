/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author gayatri
 */


//___Maze_________
//|__T_|_T__|_T__|
//|__T_|_F__|_T__|
//|__T_|__T_|___T|
public class _97MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] board={
            {true,true,true},{true,false,true},{true,true,true}
        };
        pathwithrestriction("", board, 0, 0);
    }
    static void pathwithrestriction(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathwithrestriction(p+"D", maze, r+1, c
            );
        }
        if(c<maze[0].length-1){
            pathwithrestriction(p+'R', maze, r, c+1);
        }
    }
}
