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
public class _85QuickSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int m=start+(end-start)/2;
        int pivot=arr[m];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            
        }
        // now pivot is in correct index now we have two halves of arr
        sort(arr,low,end);
        sort(arr,start,high);
        
    }
}
