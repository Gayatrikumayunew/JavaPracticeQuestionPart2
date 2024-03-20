/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Arrays;

/**
 *
 * @author gayatri
 */
public class _81bubbleSortRecusrion {
    public static void main(String[] args) {
        int arr[]={4,2,5,6};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int arr[],int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                
            
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
        }
        bubble(arr,r,c+1);
    }
    else{
    bubble(arr,r-1,0);
}}
}
