package com.pattern_printing;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        pattern5(n);
    }
    static void pattern5(int n){
        for (int i =1; i<=n; i++){
            for (int j =1; j<=n-i;j++){
                System.out.print(" ");
            }

            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(" ");

            }
}
    }