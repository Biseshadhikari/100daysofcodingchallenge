package com.First_Java_program;
import java.util.Objects;
import java.util.Scanner;

public class calculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number");
            int FirstNumber = input.nextInt();

            System.out.println("Enter second number");
            int SecondNumber = input.nextInt();

            System.out.println("Enter the operation you want to perform");
            String Operation = input.next();

            if (Objects.equals(Operation, "+")) {
                int sum = FirstNumber+SecondNumber;
                System.out.println("The sum is:"+ sum);
            }
            else if (Objects.equals(Operation, "-")) {
                int Subtract = FirstNumber-SecondNumber;
                System.out.println("The difference is:"+ Subtract);
            }
            else if (Objects.equals(Operation, "/")) {
                float Divide = (float)FirstNumber/SecondNumber;
                System.out.println("The division is:"+ Divide);
            }
            else if (Objects.equals(Operation, "*")) {
                float Multiply = (FirstNumber*SecondNumber);
                System.out.println("The multiplication is:"+ Multiply);
            }

        }
    }
