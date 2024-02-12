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
public class _62BinarySqrt {
    public static void main(String[] args) {
        int num=40;
        int p=3;
        System.out.println(sqrt(num,p));
    }
    static double sqrt(int n,int p){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m==n){
                
                return m;
            }if(m*m >n){
                e=m-1;
            }else{
                s=m+1;
            }
            
            
            
        }
        double incr=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root+=incr;
            }
            root -=incr;
            incr=incr/10;
        }
        return root;
    }
}
