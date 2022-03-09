/*
Create this pattern using java program

    * * * *
    * * *
    * *
    *

 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern3 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        pattern3(n);
    }
    static void pattern3(int n){
        for (int i=1; i<=n;i+=1){
            for (int j=1; j<=(n+1)-i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");

        }

    }
}
