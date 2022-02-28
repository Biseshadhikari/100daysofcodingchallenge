package com.function;

import java.util.Scanner;

public class product {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int product = product(firstNumber,secondNumber);
        System.out.println("The product is: " + product);

    }
    static int product(int firstNumber, int secondNumber){
        int multliplication = firstNumber*secondNumber;
        return multliplication;
    }
}
