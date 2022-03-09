/*

 Create this pattern using java program

 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern1 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        pattern1(n);

    }
    static void pattern1(int n){
        for (int i =1; i<=n; i++){
            for (int j =1; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
