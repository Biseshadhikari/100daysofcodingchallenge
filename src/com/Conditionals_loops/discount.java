package com.Conditionals_loops;

import java.util.Scanner;

public class discount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the product and the discount percentage");
        float price = input.nextFloat();
        float discount = input.nextInt();

        float discont_amount = (discount/100)*price;
        float total_cost = price-discont_amount;
        System.out.println("The total cost of the product is "+ total_cost);
    }

}
