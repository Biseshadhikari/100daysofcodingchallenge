package com.function;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int Firstnumber = input.nextInt();
        int Secondnumber = input.nextInt();
        hcf(Firstnumber, Secondnumber);
    }

    static void hcf(int firstnumber, int secondnumber) {
        int hcf = 0;
        for (int i = 2; i < firstnumber; i++) {
            if (firstnumber % i == 0 && secondnumber % i == 0) {
                hcf = i;
            }

        }
        System.out.println(hcf);
    }
}