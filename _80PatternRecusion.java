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
public class _80PatternRecusion {

    public static void main(String[] args) {
     //   triangle(4, 0);
                triangle1(4, 0);

    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle1(r, c + 1);
            System.out.print("*");

        } else {
            triangle1(r - 1, 0);
            System.out.println();

        }
    }
}
