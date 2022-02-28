package com.function;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        Isprime(number);
    }
    static void Isprime(int number){
        int i = 2;
        while (i*i<number){
            i++;
            if (number%i==0){
                System.out.println("The number is not prime");
                break;
            }
            else{
                System.out.println("The number is prime");
                break;
            }

        }

    }

}

