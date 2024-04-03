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
public class _86SkipAchar {
    public static void main(String[] args) {
//        skip("","baccdah");
              String ans=  skip1("baccdah");
              System.out.println(ans);

        
    }
    static void skip(String process,String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch =unprocess.charAt(0);
        if(ch=='a'){
            skip(process,unprocess.substring(1));
        }else{
                        skip(process+ch,unprocess.substring(1));

        }
    }
        static String skip1(String unprocess){
        if(unprocess.isEmpty()){
            return " ";
        }
        char ch =unprocess.charAt(0);
        if(ch=='a'){
         return   skip1(unprocess.substring(1));
        }else{
               return ch+         skip1(unprocess.substring(1));

        }
    }

}
