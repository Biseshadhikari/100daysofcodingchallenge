/*
print this pattern
* * * * *
 * * * *
  * * *
   * *
    *

 */
package com.pattern_printing;

import java.util.Scanner;

public class Pattern11 {
    static void pattern8(int n){
        for (int i =n; i>=1;i--){
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        pattern8(number);
    }
}
