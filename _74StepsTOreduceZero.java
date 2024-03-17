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
public class _74StepsTOreduceZero {
    public static void main(String[] args) {
     int ans=numberOfSteps(14);   
        System.out.println(ans);
    }
  static  public int numberOfSteps(int num){
        return helper(num,0);
    }
   static private int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
        
    }
}
