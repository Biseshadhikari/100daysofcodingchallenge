//Find the factorial of number
package com.Conditionals_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = input.nextInt();
        int facnum = 0;
        int factorial = 1;
        int i = 0;
        while (i != number) {
            facnum = number - i;
            factorial *=facnum;
            i++;

        }
        System.out.println(factorial);
    }

}
