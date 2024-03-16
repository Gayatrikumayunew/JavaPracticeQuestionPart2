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
public class _64factors {
    public static void main(String[] args) {
        //factor(45);
      //  factor1(36);
      factor2(45);
    }
    static void factor(int n){
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    // optimized way is
     static void factor1(int n){
        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }
                else{
                    
                
                System.out.print(i+", "+n/i+",");}
            }
        }
    }
     // in order
     static void factor2(int n){
         ArrayList<Integer>list=new ArrayList<>();
        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }
                else{
                    
                
                System.out.print(i+" ");
                list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}
