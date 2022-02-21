package com.First_Java_program;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){

            System.out.print("Enter the number");
            int number = input.nextInt();

            if(number%2==0){
                System.out.println("The number is even");

            }
            else {
                System.out.println("The  number is odd");

            }
        }
    }
}