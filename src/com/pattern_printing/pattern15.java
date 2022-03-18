/*
print this patteern
     *
    * *
   *   *
  *     *
 *       *
 *       *
  *     *
   *   *
    * *
     *


 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern15{
    static void pattenr15(int n){
        for (int i =1; i<=n;i++){
            for(int j =1;j<=n+1-i;j++){
                System.out.print(" ");
            }
            int x = i+(i-1);
            for (int j =1 ;j<=x;j++){
                if (j==1||j==x) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i =n; i>=1;i--){
            for(int j =1;j<=n+1-i;j++){
                System.out.print(" ");
            }
            int x = i+(i-1);
            for (int j =1 ;j<=x;j++){
                if (j==1||j==x) {
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
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        pattenr15(number);


    }
    

}
