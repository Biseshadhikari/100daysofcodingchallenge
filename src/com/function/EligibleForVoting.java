package com.function;

import java.util.Scanner;

public class EligibleForVoting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = input.nextInt();
        eligible(age);
    }
    static void eligible(int age){
        if (age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
