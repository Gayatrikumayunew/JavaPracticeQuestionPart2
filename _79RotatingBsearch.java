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
public class _79RotatingBsearch {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,9,0,arr.length-1));
    }
    static int search(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s]&& target<=arr[m]){
               return search(arr,target,s,m-1);
            }else{
                return search(arr,target,m+1,e);
            }
        }
        if(target>=arr[m]&&target<=arr[e]){
            return search(arr,target,m+1,m-1);
        }
        else{
            return search(arr,target,s,m-1);
        }
    }
}
