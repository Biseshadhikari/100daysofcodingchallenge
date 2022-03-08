package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();

    }
        System.out.println("Before : "  + Arrays.toString(arr));

        for (int j =0 ;j<((arr.length)/2);j++){
            int temp = arr[j];
            arr[j] = arr[(arr.length-1)-j];
            arr[(arr.length-1)-j] = temp;


}
        System.out.println("After  : " + Arrays.toString(arr));
}}

