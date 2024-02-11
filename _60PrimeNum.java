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
public class _60PrimeNum {
    public static void main(String[] args) {
        int n=2;
//        for(int i=1;i<=n;i++){
//            System.out.println(i+" "+ isPrime(i));
//        }
System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        int c=2;
        while(c*c <=n){
            if(n % c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
    
    
    
}
