package com.function;

import java.util.Scanner;

public class Romantointeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int value = romanToInt(s);
        System.out.println(value);



    }
    static int romanToInt(String s) {
        int num = 0;
        int l = s.length();
        int last = 1000;
        for (int i = 0; i < l; i++){
            int v = getValue(s.charAt(i));
            if (v > last) num = num - last * 2;
            num = num + v;
            last = v;
        }
        return num;
    }
    static int getValue(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }

//    Another approach
//Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Roman number: ");
//    String s = input.nextLine();
//    int integer = RomanInteger(s);
//        System.out.println("The integer value of "+s+" is: "+ integer);
//}
//    static int RomanInteger(String s){
////        String x = " ";
//        int value = 0;
//        int sum =0;
//        int last = 1000;
//        for (int i =0; i<s.length(); i++){
//            char x = s.charAt(i);
//            switch (x) {
//                case 'I' -> value = 1;
//                case 'V' -> value = 5;
//                case 'X' -> value = 10;
//                case 'L' -> value = 50;
//                case 'C' -> value = 100;
//                case 'D' -> value = 500;
//                case 'M' -> value = 1000;
//            }
//            if (value>last) sum = sum - last*2;
//            sum = sum +value;
//            last = value;
//
//
//
//        }
//        return sum;
//    }
}
