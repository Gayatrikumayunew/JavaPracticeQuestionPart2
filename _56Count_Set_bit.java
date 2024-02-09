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
public class _56Count_Set_bit {
    public static void main(String []ar){
        int n=45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    static int setBits(int n ){
        int c=0;
        while(n>0){
            c++;
            n-=(n&-n);
        }
        return c;
    }
}
