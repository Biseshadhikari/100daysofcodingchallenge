package com.function;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        int factorial = factorial(number);
        System.out.println(factorial);
    }
    static int factorial(int number){
        int factorial = 1;
        int i =0;
        int num = number;
        while (i<num){
            number = num-i;
            factorial = factorial*number;
            i++;

        }
        return factorial;

    }
}
