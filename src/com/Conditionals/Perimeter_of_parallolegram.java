package com.Conditionals;

import java.util.Scanner;

public class Perimeter_of_parallolegram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of base and side");
        double base = input.nextDouble();
        double side = input.nextDouble();
        double Area = 2*(base+side);
        System.out.println("The perimeter of parallelogram is : " +Area);


    }

}
