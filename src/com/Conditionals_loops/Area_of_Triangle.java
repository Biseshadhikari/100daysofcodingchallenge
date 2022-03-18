package com.Conditionals_loops;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of base and height");
        float base = input.nextFloat();
        float height = input.nextFloat();
        float Area = (float) ((base*height)/2);
        System.out.println("The area of trinagle is:" + Area);




    }
}
