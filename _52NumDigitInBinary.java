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
public class _52NumDigitInBinary {
    public static void main(String []ar){
        int  n=34452;
        int b=10;// change base according to need for binary 2,octal 8,decimal 10
        int ans=(int)(Math.log(n)/Math.log(b)+1);
        System.out.println(ans);
    }
}
