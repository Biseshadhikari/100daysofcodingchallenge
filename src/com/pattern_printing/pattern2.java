/*
    Create this pattern using java progam

        *
        * *
        * * *
        * * * *
        * * * * *

 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern2 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        pattern2(n);


    }
    static void pattern2(int n){
        for (int i =1; i<=n;i++){
            for (int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
