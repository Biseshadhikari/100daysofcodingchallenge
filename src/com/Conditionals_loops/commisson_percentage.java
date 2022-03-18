package com.Conditionals_loops;

import java.util.Scanner;

public class commisson_percentage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of real product and the commison ");
        float price = input.nextFloat();
        float commission =input.nextFloat();
        float commissio_precentage = (commission/price)*100;
        System.out.println("The commission percentage is "+commissio_precentage+"%");
    }
}
