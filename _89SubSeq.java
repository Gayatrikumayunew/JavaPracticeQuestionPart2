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
public class _89SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");
           System.out.println(   subseq1("", "abc"));

    }
    static void subseq(String pr,String up){
        if(up.isEmpty()){
            System.out.println(pr);
            return;
        }
        char ch=up.charAt(0);
        subseq(pr+ch, up.substring(1)); // take it
        subseq(pr, up.substring(1));// ignore it
    }
        static ArrayList<String> subseq1(String pr,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(pr);
            return list;
            
        }
        char ch=up.charAt(0);
       ArrayList<String>left= subseq1(pr+ch, up.substring(1)); // take it
        ArrayList<String> right=subseq1(pr, up.substring(1));// ignore it
        left.addAll(right);
        return left;
    }
}
