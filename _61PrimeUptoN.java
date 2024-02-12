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

public class _61PrimeUptoN {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n + 1]; // up to 40 there are n+1 values
        sieve(n, prime);
    }

    static void sieve(int n, boolean[] arr) {
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j += i) { // Corrected increment
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
