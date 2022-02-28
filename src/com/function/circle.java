package com.function;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        float area = area(radius);
        float circumference = cicrumference(radius);
        System.out.println("The area of circle is : "+ area);
        System.out.println("The circumference of circle is : "+ circumference);

    }
    static float area(float radius){
        return (float)(Math.PI)*radius*radius;

    }
    static float cicrumference(float radius){
        return (float) ((float) 2*(Math.PI)*radius);
    }
}
