package com.Conditionals;

import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int x= 0;
        int number = input.nextInt();
        for (int i =1; i<number; i++){
            if (number% i==0){
                x+=i;
            }
        }
        if (x==number){
            System.out.println("The number is perfct number");
        }
        else {
            System.out.println("The number is not perfect number");
        }
    }
}
