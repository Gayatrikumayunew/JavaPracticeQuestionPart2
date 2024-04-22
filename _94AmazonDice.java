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
public class _94AmazonDice {
    public static void main(String[] args) {
        //dice("",4);
        System.out.println(     dicelist("",4));
        
    }
    static void dice(String p,int target){
     if(target==0){
         System.out.println(p);
         return;
     }   
     for(int i=1;i<=6&&i<=target;i++){
         dice(p+i,target-i);
         
     }
    }
     
static ArrayList<String> dicelist(String p,int target){
    if(target==0){
        ArrayList<String>list=new ArrayList<>();
        list.add(p);
        return list;
    }
      ArrayList<String>list=new ArrayList<>();
     for(int i=1;i<=6&&i<=target;i++){
        list.addAll( dicelist(p+i,target-i));
         
     }
return list;
}
}
