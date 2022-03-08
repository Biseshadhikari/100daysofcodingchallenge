package com.function;

import java.util.Scanner;

public class powerInjava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.println("Enter the power");
        int power = input.nextInt();
        int answer = power(number,power);
        System.out.println(answer);


    }
    static int power(int number, int power){
        int x =1;
        for (int i = 0;i<power; i++ ){
            x *=number;
        }
        return x;
    }
}
 