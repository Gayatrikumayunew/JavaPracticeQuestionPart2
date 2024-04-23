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
public class _96MazeDiagonalPath {

    public static void main(String[] args) {
        System.out.println(pathDia("",3,3));
    }

    static ArrayList<String> pathDia(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
if(r>1&&c>1){
    list.addAll(pathDia(p+"Diagonally",r-1,c-1));
}
        if (r > 1) {
            list.addAll(pathDia(p + "Down ", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathDia(p + "Right ", r, c - 1));
        }
        return list;

    }
}
