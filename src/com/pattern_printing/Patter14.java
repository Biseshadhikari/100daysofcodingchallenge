/*
print this pattern
*********
 *     *
  *   *
   * *
    *
 */
package com.pattern_printing;

import java.util.Scanner;

public class Patter14 {
    static void pattern14(int n){
        for (int i =n; i>=1;i--){
            int sum = i+(i-1);
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=sum;j++){
                if (j==1||j==sum||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        pattern14(number);
    }
}
