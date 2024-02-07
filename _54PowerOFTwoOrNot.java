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
public class _54PowerOFTwoOrNot {
    public static void main(String []ar){
        int n=16;
        boolean ans=(n &(n-1))==0;
        System.out.println(ans);
        
    }
}
