package com.function;


import java.util.Scanner;

public class primeNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int from = input.nextInt();
        int to = input.nextInt();
        primenumber(from,to);

    }
    static void primenumber(int from,int to){
        int x= from;

        for (from = x; from<to;from++){
            int i = 2 ;
            while (i<from){
                if (from%i==0){
                    break;
                }
                i++;
            }
            if(i>= from&&from!=1){
                System.out.println(from);
        }

    }


}}


