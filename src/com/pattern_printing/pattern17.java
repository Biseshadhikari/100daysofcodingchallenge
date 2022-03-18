/*
print this pattern
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    ****  ****
    ***    ***
    **      **
    *        *
 */
package com.pattern_printing;

public class pattern17 {
    public static void main(String []args){
        int n =5;
        pattern17(n);
    }
    static void pattern17(int n){
        for (int i =1 ;i<=2*n;i++){
            int col = i>n?2*n-i:i;
            for (int j =1;j<=col;j++){
                System.out.print("*");
            }
            int space = i>n?(2*i-2*n):(2*(n-i));
            for (int j=1; j<=space;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
