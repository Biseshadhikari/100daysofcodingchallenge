package com.Conditionals_loops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number");
        int number = input.nextInt();
        int reverse = 0 ;
        while (number!=0){
            int reminder = number%10;
            number = number/10;
            reverse= reverse*10+reminder;
        }
        System.out.println(reverse);
        }
    }

