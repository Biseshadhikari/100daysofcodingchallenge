/*
print this pattern
    *
   * *
  *   *
 *     *
*********


 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern13 {
    static void pattern13(int n){
        for (int i =1; i<=n;i++){
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
        pattern13(number);
    }
}
