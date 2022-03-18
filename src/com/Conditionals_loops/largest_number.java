package com.Conditionals_loops;

//Question: Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
//        int sum = 0;
        int largest_number = 0;
        while (number != 0) {
            System.out.println("Enter the number");
            number = input.nextInt();
            if (number>largest_number) {
                largest_number = number;
            }

        }
        System.out.println("The total sum is : " +largest_number);
    }
}