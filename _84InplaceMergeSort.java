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
public class _84InplaceMergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergeSort1(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort1(int []arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergeSort1(arr,s,mid);
        mergeSort1(arr,mid,e);
        
      merge(arr,s,mid,e);
    }
    private static void merge(int[]arr,int s,int mid,int e){
        int[]mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
      for(int l=0; l<mix.length;l++){
          arr[s+l]=mix[l];
          
      };
    }
    
    
    
    
    
}
