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
public class _67nto1 {
    public static void main(String[] args) {
//        fun(9);
        funboth(9);
    }
    static void fun(int n){
        if(n==0){
            return;
        } 
        System.out.print(n);
         fun(n-1);
    }
      static void funboth(int n){
        if(n==0){
            return;
        } 
        System.out.print(n+" ");
         funboth(n-1);
          System.out.print(n+" ");
    }
}
