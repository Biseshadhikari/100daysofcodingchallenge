package com.function;

import java.util.Scanner;

public class Pythagorean_triplet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a= input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean isPythagoreantriplet = IsPythagoreantriplet(a,b,c);
        System.out.println(isPythagoreantriplet);
    }
    static boolean IsPythagoreantriplet(int a, int b ,int c){
        boolean isPythagoreantriplet = true;
        int first_case = a*a+b*b;
        int second_case = c*c;
        if (first_case==second_case){
            return true;
        }
        else {
            isPythagoreantriplet=false;
        }
        return isPythagoreantriplet;
    }
}
