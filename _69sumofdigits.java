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
public class _69sumofdigits {
    public static void main(String[] args) {
        int ans=sum(1423);
        System.out.println(ans);
        
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10+sum(n/10));
    }
}
