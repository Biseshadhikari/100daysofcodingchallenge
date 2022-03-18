//Question: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package com.Conditionals_loops;
import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        while (number != 0) {
            System.out.println("Enter the number");
            number = input.nextInt();
            sum = sum +number;
        }
        System.out.println("The total sum is : " +sum);
    }
}