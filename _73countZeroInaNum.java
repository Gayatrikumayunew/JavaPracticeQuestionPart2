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
public class _73countZeroInaNum {
    public static void main(String[] args) {
        int ans=numcount(30204);
        System.out.println(ans);
    }
   static  int count=0;   

    static int numcount(int n){
                if (n == 0) {
            return count;
        }

        int rem=n%10;
        if(rem==0){
            count++;
        }
        return numcount(n/10);
    }
}
