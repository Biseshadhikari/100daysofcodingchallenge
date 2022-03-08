package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the length: ");
////        int n = input.nextInt();
//        int[] arr = new int[3];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
////
////    }
//////        for (int j : arr) {
//////            System.out.print(j + " ");
//////
//////
//////        }
//        }
//        System.out.println(Arrays.toString(arr));

//        array of object

//        String[] str = new String[4];
        int[] str = {1,2,3};
//        for (int i =0 ;i<str.length; i++){
//             str[i] = input.next();
//
//        }
//        for (String value : str) {
//            System.out.println(value);
//        }
//        System.out.println(str[0]);
        for (int i =0; i<((str.length)/2); i++){
            int temp = str[i];
            str[i] = str[(str.length-1)-i];
            str[(str.length-1)-i] = temp;

    }
        System.out.println(str);
}}