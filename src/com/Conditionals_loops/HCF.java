package com.Conditionals_loops;

import java.util.Scanner;

public class HCF{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int hcf =0;
        for (int i=1; i<=number1; i+=1) {
            if (number1%i==0 && number2 %i ==0) {
//                System.out.println(i)
                hcf = i;
            }
        }
        System.out.println("The highest common factor is : " +hcf);

    }
}
