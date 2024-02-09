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
public class _57xorFrom0Toa {
    public static void main(String []ar){
        int n=9;
    int ans=    XorFrom0(n);
    System.out.println(ans);
        
    }
    static int XorFrom0(int n){
        if(n%4==0){
            return n;}
        else if(n%4==1){
            return 1;
        }else if(n%4==2){
            return n+1;
        }
        else if(n%4==3){
            return 0;
        }
        return -1;
    }
}
