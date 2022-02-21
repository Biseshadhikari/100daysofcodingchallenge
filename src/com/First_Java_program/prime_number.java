package com.First_Java_program;

import java.util.Scanner;


public class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 2;
        System.out.println("Input the number");
        int number = input.nextInt();
        if(number <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        while (a*a < number) {
            if (number % a == 0) {
                System.out.println("Not prime");
                break;
            }
            a++;
        }
        if (a*a >= number) {
            System.out.println("The number is prime");

        }
    }
}