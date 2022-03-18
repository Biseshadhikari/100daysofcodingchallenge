package com.pattern_printing;


/*
print this pattern
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    *        *
    **      **
    ***    ***
    ****  ****
    **********

 */
import java.util.Scanner;

public class pattern16 {
    static void pattern16(int n){
        int space = 0;
        for (int i =1 ; i<=n;i++){
            for(int j=1; j<=n+1-i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=space;j++ )
            {
                System.out.print(" ");
            }
            space+=2;
            for(int j=1; j<=n+1-i;j++){
                System.out.print("*");
            }

            System.out.println(" ");

        }
        int x=1;
       for (int i=1; i<=n;i++){
           for (int j=1;j<=i;j++){
               System.out.print("*");
           }

           int space1 = 2*n-(2*x);
           for(int j=1;j<=space1;j++){
               System.out.print(" ");

           }
           for (int j=1;j<=i;j++){
               System.out.print("*");
           }
           x++;
           System.out.println();

       }
    }





public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number  = input.nextInt();
        pattern16(number);
    }
}
