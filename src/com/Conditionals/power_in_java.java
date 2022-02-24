package com.Conditionals;

import java.util.Scanner;

public class power_in_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the power");
        int power = input.nextInt();
        System.out.println("Enter the number");
        int number = input.nextInt();
        int answer =1;
        for (int i = 0; i<power;i+=1){
            answer = answer*number;


        }
       System.out.println(answer);
    }
}