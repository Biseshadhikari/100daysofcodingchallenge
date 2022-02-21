package com.Conditionals;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input the number");
        int number = input.nextInt();
        for (int i=1; i<=number;i+=1) {
            if (number%i==0) {
                System.out.println(i);
            }
        }

    }
}

