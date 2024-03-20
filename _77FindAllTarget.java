/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.ArrayList;

/**
 *
 * @author gayatri
 */
public class _77FindAllTarget {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        findall(arr,4,0);
        System.out.println(list);
    }
    static ArrayList<Integer>list=new ArrayList<>();
    static void findall(int []arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findall(arr,target,index+1);
    }
}
