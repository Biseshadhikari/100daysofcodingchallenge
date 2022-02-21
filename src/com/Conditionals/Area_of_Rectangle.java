package com.Conditionals;

import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of base and height");
        float length = input.nextFloat();
        float width = input.nextFloat();
        float Area = length*width;
        System.out.println("The area of trinagle is:" + Area);

    }
}
