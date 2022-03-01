package com.function;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean ispalindrome=  Ispalindrome(number);
        System.out.println(ispalindrome);

    }
    static boolean Ispalindrome(int number){
        boolean Ispalindrome = true;
        int sum =0;
        int x = number;
        while (number>0){
            int reminder = number%10;
            number = number/10;
            sum = sum*10 + reminder;
        }
        if (x == sum){
            return true;
        }
        else {
            Ispalindrome = false;
        }
        return Ispalindrome;
    }

}
