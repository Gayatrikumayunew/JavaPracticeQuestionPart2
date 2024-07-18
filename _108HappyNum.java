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
public class _108HappyNum {
    public boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findsqr(slow);
            fast=findsqr(findsqr(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    private int findsqr(int n){
        int ans=0;
        while(n>0){
          int rem=n%10;
          ans=rem*rem;
          n=n/10;
          
        }
        return ans;
    }
}
