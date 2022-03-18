/*
print this pattern
1
12
123
1234
12345
 */
package com.pattern_printing;

import java.util.Scanner;

public class pattern4 {
    static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for (int j =1 ; j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        pattern4(number);

    }
}
