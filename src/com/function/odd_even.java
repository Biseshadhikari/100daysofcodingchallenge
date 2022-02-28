package com.function;

//import com.First_Java_program.OddOrEven;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = input.nextInt();
        OddOrEven(a);
    }
    static void OddOrEven(int a){
        if (a%2 ==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
