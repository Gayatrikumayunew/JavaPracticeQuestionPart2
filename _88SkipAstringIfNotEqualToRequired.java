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
public class _88SkipAstringIfNotEqualToRequired {
    public static void main(String[] args) {
        String ans=SkipAppNotApple("bccappndapplenj");
        System.out.println(ans);
    }
    static  String SkipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return SkipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+SkipAppNotApple(up.substring(1));
        }
    }
}
