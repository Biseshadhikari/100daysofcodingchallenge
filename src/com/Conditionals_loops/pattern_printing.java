package com.Conditionals_loops;

public class pattern_printing {
    public static void main(String[] args) {
        /*
         * * * * *
         *
         *
         *
         * * * * *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == 4) && (j >= 0 && j < 5)) {
                    System.out.print("*");

                } else if ((i > 0 && i < 4) && j == 0) {
                    System.out.print("*");
                }
//                System.out.println("");


            }
            System.out.println(" ");
////
//        for (int i = 1 ; i<6; i++) {
//            for (int j =1 ; j<6; j++) {
//                if (j<=i){
//                    System.out.print(j);
//
//                }
//
//            }
//            System.out.println(" ");
//        }
//
//        }

        }}}

