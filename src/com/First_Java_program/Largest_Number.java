package com.First_Java_program;
import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int FistNumber = input.nextInt();

        System.out.println("Enter the second number: ");
        int SecondNumber = input.nextInt();

        if (FistNumber>SecondNumber) {
            System.out.println("First number is largest");
        }
        else {
            System.out.println("Second number is largest");
        }


    }
}