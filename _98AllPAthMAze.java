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
public class _98AllPAthMAze {
     public static void main(String[] args) {
        boolean[][] board={
            {true,true,true},{true,true,true},{true,true,true}
        };
        allpath("", board, 0, 0);
   //do not move back to the same path otherwise recusion will be never ending known as baktraking problem,those cells that has visited mark as false
}
         static void allpath(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r>0){
            allpath(p+"U",maze,r-1,c);
        }
        if(c>0){
                        allpath(p+"L",maze,r,c-1);

        }
        if(r<maze.length-1){
            allpath(p+"D", maze, r+1, c
            );
        }
        if(c<maze[0].length-1){
            allpath(p+'R', maze, r, c+1);
        }// this line is where thr function will be over
        //so before the function gets removed,also remove the changes made by that function
        maze[r][c]=true;
        
    }
}

