package com.Conditionals_loops;

import java.util.Scanner;

public class Average_of_N_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth number");
        int number = input.nextInt();
        float Average = 0f;
        float sum = 0f;
        for (int i=1; i<=number;i++){
            sum = sum+i;
            Average = sum/number;

        }
        System.out.println(Average);
    }
}
