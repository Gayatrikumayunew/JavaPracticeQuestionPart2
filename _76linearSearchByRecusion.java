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
public class _76linearSearchByRecusion {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,8};
        int target=4;
      //  System.out.println(find(arr,target,0));
        System.out.println(findindex(arr,target,0));
    }
    static boolean find(int[]arr,int target,int index){
        if(index ==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    static int findindex(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findindex(arr,target,index+1);
        }
    }
}
