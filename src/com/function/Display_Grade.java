package com.function;

import java.util.Scanner;

public class Display_Grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yoru marks: ");
        int Marks = input.nextInt();
        Display_Grade(Marks);
    }
    static void Display_Grade(int marks){
        if (marks>=91 && marks<=100){
            System.out.println("your grade is : AA ");
        }
        else if (marks>=81 && marks<=90){
            System.out.println("your grade is : AB");
        }
        else if (marks>=71 && marks<=80){
            System.out.println("your grade is : bb ");
        }
        else if (marks>=61 && marks<=70){
            System.out.println("your grade is : bc ");
        }
        else {
            System.out.println("fail");
        }
    }
}
