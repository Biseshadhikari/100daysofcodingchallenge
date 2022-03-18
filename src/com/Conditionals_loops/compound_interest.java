package com.Conditionals_loops;

import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the interest rate");
        float r = input.nextFloat();
        System.out.println("Enter the principle");
        float p = input.nextFloat();
        System.out.println("Enter the time");
        float n = input.nextFloat();
        float x = (1+(r/100));
        float y = 1;
        for (int i=0; i<n;i++){
            y = y * x;
        }
//        System.out.println(y);
        float compound_interest = (p*(y))-p;
        System.out.println(compound_interest);
        float total_amount =p+compound_interest;
        System.out.println(total_amount);
    }
}
