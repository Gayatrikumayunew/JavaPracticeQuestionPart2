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
public class _75ArraysortedOrno {
    public static void main(String[] args) {
        int arr[]={1,2,33,4,5,6,7};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int [] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index +1]&& sorted(arr,index+1);
    }
}
