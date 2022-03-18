package com.Conditionals_loops;

import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radios = input.nextFloat();
        float Area = (float) (Math.PI*radios*radios);
        System.out.println("The area of circle is:" + Area);
    }
}
