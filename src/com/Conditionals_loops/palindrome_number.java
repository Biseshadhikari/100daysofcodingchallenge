package com.Conditionals_loops;

import java.util.Scanner;

//check whether the number is palindrome or not
public class palindrome_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        int reverse = 0 ;
        int divide = number;
        while (divide!=0){
            int reminder = divide%10;
            divide = divide/10;
            reverse= reverse*10+reminder;
        }
        if (number == reverse){
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number isn't palindrome");
        }
    }

}

