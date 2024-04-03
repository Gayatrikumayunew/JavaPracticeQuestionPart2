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
public class _87SkipaString {
    public static void main(String[] args) {
        System.out.println(skipApple("bapplecch"));
    }
    static String skipApple(String a){
        if(a.isEmpty()){
            return "";
        }
        if(a.startsWith("apple")){
            return skipApple(a.substring(5));
        }else{
            return a.charAt(0)+skipApple(a.substring(1));
        }
    }
}
