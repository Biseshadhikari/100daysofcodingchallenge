package com.function;

import java.util.Scanner;

public class armstrongNumbers {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = input.nextInt();
            boolean isarmstrong = isarmstrong(number);
            System.out.println(isarmstrong);
            System.out.println(" ");
        }

    }
    static boolean isarmstrong(int number){
        int sum = 0;
        boolean ispalindrome = true;
        int a= number;
        while (number>0){
            int reminder = number%10;
            number = number/10;
            sum = sum+reminder*reminder*reminder;



        }
        if (a==sum){
            return ispalindrome;
        }
        else{
            ispalindrome = false;

    }
        return ispalindrome;
}}
