package com.Conditionals_loops;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string ");
        String string = input.nextLine();
        StringBuilder reverse = new StringBuilder("");
        int length = string.length();
        for (int i =0; i<=length-1; i++){
            char rev = string.charAt((length-1)-i);
            reverse.append(rev);
        }
        System.out.println(reverse);
    }

}
