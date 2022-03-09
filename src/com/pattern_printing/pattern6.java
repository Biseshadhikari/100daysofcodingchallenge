/*
Create this pattern using java programmning
*
* *
* * *
* * * *
* * * * *
* * *
* *
*
 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        pattern6(n);
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - 1) - i; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}