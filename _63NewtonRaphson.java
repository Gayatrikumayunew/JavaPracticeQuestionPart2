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
public class _63NewtonRaphson {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
         double  root;
        double x=n;
        while(true){
           root=0.5*(x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
            
}
