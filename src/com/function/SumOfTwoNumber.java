package com.function;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int First_number = input.nextInt();
        int Second_number = input.nextInt();
        int sum = sum(First_number,Second_number);
        System.out.println("The sum is : "+ sum);


    }
    static int sum(int First_number,int Second_number){
        int addition =First_number+Second_number;
        return addition;
    }

}
