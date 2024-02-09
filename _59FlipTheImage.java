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
import java.util.Arrays;

public class _59FlipTheImage {

    public static void main(String[] ar) {
        int arr[][] = {{0, 1, 0}, {0, 0, 1}, {1, 0, 0}};
       // System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    int[][] flippedAndInverted = flipAndInvertImage(arr);

    // Print the resulting array
    for (int[] row : flippedAndInverted) {
        System.out.println(Arrays.toString(row));
    }
}

    

    static int[][] flipAndInvertImage(int[][] arr) {
        for (int[] row : arr) {
            //reverse
            for (int i = 0; i < (arr[0].length + 1) / 2; i++) {
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length - i - 1] ^ 1;
                row[arr[0].length - i - 1] = temp;
            }
        }
        return arr;
    }
}

