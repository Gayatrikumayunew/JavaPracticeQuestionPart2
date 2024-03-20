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
public class _78returnArraylist {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        //System.out.println(findall(arr,4,0,new ArrayList<>()));
                System.out.println(findall1(arr,4,0));

    }
    static ArrayList <Integer> findall(int arr[],int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findall(arr,target,index+1,list);
    }
    static ArrayList <Integer> findall1(int arr[],int target,int index){
        ArrayList <Integer>list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans= findall1(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
