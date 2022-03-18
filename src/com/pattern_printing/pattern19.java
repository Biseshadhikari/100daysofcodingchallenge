/*
       A
       A B
       A B C
       A B C D
       A B C D E

 */
package com.pattern_printing;

public class pattern19 {
    public static void main(String[] args){

        int n =5;
        int a = 65;
        for (int i =0; i<=n;i++){
            for(int j =0;j<=i;j++){
                System.out.print((char)(a+j));
            }
            System.out.println();
        }
    }
}
