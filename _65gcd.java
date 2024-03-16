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
public class _65gcd {
    public static void main(String[] args) {
        int ans =gcd(21,14);
        System.out.println(ans);
    }
    static int gcd(int a ,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
   
}
