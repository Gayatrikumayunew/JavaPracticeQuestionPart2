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
public class _93MobilePadGoogle {
    public static void main(String[] args) {
       // Pad("","12")    ;
      //  System.out.println(  padlist("","12"));
System.out.println(padcount("","12"));
        
    }
    static void Pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';//convert '2' into 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            Pad(p+ch,up.substring(1));
        }
        
    }
    static ArrayList<String>padlist(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String>list =new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(padlist(p+ch,up.substring(1)));
        }
        return list;
    }
    static int padcount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int c=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            c=c+padcount((p+ch),up.substring(1));
        }
        
            
        return c;
    }
}
