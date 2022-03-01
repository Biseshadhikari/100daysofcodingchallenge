package com.function;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nth = input.nextInt();
        int sum = sumofn(nth);
        System.out.println(sum);

    }
    static int sumofn(int nth){
        int sum = 0 ;
        for (int i =0; i<=nth; i++){
            sum+=i;

        }
        return sum;

    }
}
