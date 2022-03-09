package com.pattern_printing;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        pattern4(n);
    }

    static void pattern4(int n) {
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println(" ");

        }
    }
}
