/*
print this pattern
*
**
***
****
*****
****
***
**
*

 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern5 {
    static void pattern5(int n)
    {
        for (int i =1; i<=2*n;i++){
            int col =i>n?2*n-i:i;
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        pattern5(number);

    }
}
