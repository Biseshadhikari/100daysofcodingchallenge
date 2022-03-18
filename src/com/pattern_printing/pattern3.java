/*
print this pattern
*****
****
***
**
*

 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern3 {
    static void pattern3(int n){
        for(int i =1; i<=n;i++){
            for(int j=1; j<=n+1-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        pattern3(number);
    }
}
