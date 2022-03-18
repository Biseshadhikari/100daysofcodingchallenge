package com.Conditionals_loops;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int x= input.nextInt();
        int y = input.nextInt();

        for (int i=1;i<x*y;i++){
            if (i%x==0 && i%y==0){
                System.out.println("The lcm is " + i);
            }
            else {
                System.out.println("The lcm is "+(x*y));
                break;
            }
        }
    }
}
