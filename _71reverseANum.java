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
public class _71reverseANum {
 
    public static void main(String[] args) {
      //  revese(142);
//      reverse1(142);
//        System.out.println(sum);
        System.out.println( reverse2(452));
    }
//    static void revese(int n){
//        if(n==0){
//            return;
//        }
//        int r=n%10;
//        System.out.print(r);
//        revese(n/10);
//    }
    
//     
//    static int sum=0;
//    static void reverse1(int n){
//        if(n==0){
//            return ;
//        }
//        int rem=n%10;
//        sum=sum*10+rem;
//        reverse1(n/10);
//        
        
//       }
    static int reverse2(int n){
        int digits=(int)(Math.log10(n)+1);
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10, digits-1))+helper(n/10,digits-1);
    }
}
