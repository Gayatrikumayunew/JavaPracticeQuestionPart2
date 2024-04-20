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
public class _92permutation {
    public static void main(String[] args) {
       // permutations("","abc");   
//       ArrayList<String>ans=permutationsList("", "abc");
//        System.out.println(ans);
System.out.println(permutationscount("", "abcd"));
    }
//    static void permutations(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//                    
//          }
//        char ch=up.charAt(0);
//        for(int i=0;i<=p.length();i++){
//            String f=p.substring(0,i);
//            String s=p.substring(i,p.length());
//            permutations(f+ch+s,up.substring(1));
//            
//        }}
//        static ArrayList<String> permutationsCount(String p,String up){
//        if(up.isEmpty()){
//            
//        ArrayList<String>list=new ArrayList<>();
//        list.add(p);
//            return list;
//                    
//          }
//        char ch=up.charAt(0);
//        ArrayList<String>ans=new ArrayList<>();
//        for(int i=0;i<=p.length();i++){
//            String f=p.substring(0,i);
//            String s=p.substring(i,p.length());
//           ans.addAll( permutationsList(f+ch+s,up.substring(1)));
//            
//        
//        }
//        return ans;
//        
//    }
         static int permutationscount(String p,String up){
      if(up.isEmpty()){
            return 1;
                    
          }
      int c=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
        c=c+    permutationscount(f+ch+s,up.substring(1));
            
        }
        return c;
         }
}
