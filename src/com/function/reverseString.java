package com.function;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = input.nextLine();
        String reverse = reverse(string);
        System.out.println(reverse);

    }
    static String reverse(String string){
        StringBuilder reverse = new StringBuilder();
        for (int i=0; i<string.length(); i++){
            char x = string.charAt((string.length()-1)-i);
            reverse.append(x);


        }
        return reverse.toString();

    }
}
