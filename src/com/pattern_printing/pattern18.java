/*
print this pattern

    *        *
    **      **
    * *    * *
    *  *  *  *
    *   **   *
    *  *  *  *
    * *    * *
    **      **
    *        *

 */
package com.pattern_printing;

public class pattern18 {
    public static void main(String[] args){
        int n =5;
        pattern18(n);

    }
    static void pattern18(int n){
        for (int i =1; i<=2*n;i++){
            int col=i>n?2*n-i:i;
            for(int j =1 ;j<=col;j++){
                if (j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            int space = i>n?(2*i-2*n):(2*(n-i));
            for(int j =1; j<=space;j++){
                System.out.print(" ");
            }
            for (int j =1; j<=col;j++){
                if (j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
