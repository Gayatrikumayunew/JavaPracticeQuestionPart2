/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.ArrayList;

/**
 *
 * @author gayatri
 */
public class _95MazeProb {
    public static void main(String[] args) {
//        System.out.println( count(2,2));  
path("",3,3);
        System.out.println(pathlist("",3,3));
    }
    static int count(int r,int c){
        if(r==1|| c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static void path(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"Down ",r-1,c);
        }
        if(c>1){
            path(p+"Right ",r,c-1);
        }
    }
    static ArrayList<String>pathlist(String p,int r,int  c){
        if(r==1&&c==1){
            ArrayList <String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        
                    ArrayList <String>list=new ArrayList<>();
                     if(r>1){
           list.addAll( pathlist(p+"Down ",r-1,c));
        }
        if(c>1){
         list.addAll(   pathlist(p+"Right ",r,c-1));
        }
    return list;

    }
}
