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
public class _58RangeXor {
 public static void main(String []ar){
     int a=3;
     int b=9;
     int ans=xor(b) ^ xor(a-1);
     System.out.println(ans);
 }   
 static int xor(int a){
     if(a%4==0){
         return a;
     }
        if(a%4==1){
         return 1;
     }   if(a%4==2){
         return a+1;
     }   if(a%4==3){
         return 0;
     }
     return -1;
 }
}
