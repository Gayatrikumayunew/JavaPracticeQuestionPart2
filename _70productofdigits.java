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
public class _70productofdigits {
    public static void main(String[] args) {
        int ans=prod(505);
        System.out.println(ans);
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
