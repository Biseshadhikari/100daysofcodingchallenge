package com.function;

import java.util.Scanner;

public class maximum_minimum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ther number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = max(a,b,c);
        int min = min(a,b,c);
        System.out.println("The smallest number is "+ min);
        System.out.println("The lartest number is "+max);
    }
    static int max(int a,int b,int c){
        int largest = a;
        if (b>largest){
            largest =b;
        }
        if (c>largest){
            largest = c;

        }
        return largest;
    }
    static int min(int a,int b,int c){
        int smallest = a;
        if (b<smallest){
            smallest =b;

        }
        if (c<smallest){
            smallest = c;
        }
        return smallest;

    }
}
