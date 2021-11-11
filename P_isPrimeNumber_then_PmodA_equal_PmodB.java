package com.company;

import java.util.Scanner;

public class P_isPrimeNumber_then_PmodA_equal_PmodB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t:");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter n:");
            int P = sc.nextInt();   // it is P - prime number

            // we have to find the numbers A and B so that
            // P mod A = P mod B

            // Approach :
            // We know that, prime number is always odd except 2
            // So we are considering that after taking modulo our remainder will always be 1
            // So, we can let 2 as our A because P mod A = P mod B = 1 (let)
            // now our B will be (P-1)

            int A = 2, B = P - 1;
            System.out.println("A = " + A + " and " + "B = " + B);
        }
    }
}
