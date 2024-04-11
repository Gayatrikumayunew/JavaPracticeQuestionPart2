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
public class _90Ascii_Value {
    public static void main(String[] args) {
                subset("", "abc");
           System.out.println(   subset("", "abc"));

    }
    static ArrayList<String>subset(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>first=subset(p+ch,up.substring(1));
        ArrayList<String>second=subset(p,up.substring(1));
        ArrayList<String>third=subset(p+(ch+0),up.substring(1));
        first.addAll(second);
first.addAll(third);
return first;
    }
}
