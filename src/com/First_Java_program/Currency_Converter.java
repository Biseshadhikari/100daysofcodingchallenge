package com.First_Java_program;
//Input currency in rupees and output in USD.
import java.util.Scanner;


public class Currency_Converter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value in NPR: ");
        float NPR = input.nextFloat();
        float USD = NPR/119.57f;
        System.out.println("USD$ :" +USD);



    }
}