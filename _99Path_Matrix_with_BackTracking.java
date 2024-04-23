/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Arrays;

/**
 *
 * @author gayatri
 */
public class _99Path_Matrix_with_BackTracking {
    
    public static void main(String[] args) {
           boolean[][] board={
            {true,true,true},{true,true,true},{true,true,true}
        };
           int[][] path=new int[board.length][board[0].length];
     allpathprint("",board,0,0,path,1);
    }
  static void allpathprint(String p,boolean[][]maze,int r,int c,int path[][],int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
for(int []arr:path){
    System.out.println(Arrays.toString(arr));
}
            System.out.println(p);
            System.out.println();
        return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r>0){
            allpathprint(p+"U",maze,r-1,c,path,step+1);
        }
        if(c>0){
                        allpathprint(p+"L",maze,r,c-1,path,step+1);

        }
        if(r<maze.length-1){
            allpathprint(p+"D", maze, r+1, c,path,step+1
            );
        }
        if(c<maze[0].length-1){
            allpathprint(p+'R', maze, r, c+1,path,step+1);
        }// this line is where thr function will be over
        //so before the function gets removed,also remove the changes made by that function
        maze[r][c]=true;
        path[r][c]=0;
        
    }
}

