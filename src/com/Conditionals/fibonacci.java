package com.Conditionals;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term of the series");
        int n = input.nextInt();
        int a= 0 ;
        int b =1 ;
        int next = 0 ;
        System.out.print(a+" " + b+" ");
        for (int i= 2; i<=n; i+=1) {
            next = a+b;
            System.out.print(next +" ");
            a = b;
            b = next;
        }


    }
}
