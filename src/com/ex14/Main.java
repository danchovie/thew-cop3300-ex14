/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex14;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        int order;
        double subtotal, tax=0.55;
        String state;
        System.out.print("What is the order amount? ");
        order = newScanner.nextInt();
        newScanner.nextLine();
        System.out.print("What is the state? ");
        state = newScanner.nextLine();
        subtotal = (double) order;
        System.out.printf("The subtotal is $%.2f.\n", subtotal);
        if(state.equals("WI")){
            System.out.printf("The tax is $%.2f.\n", tax);
            subtotal+=tax;
        }
        System.out.printf("The total is $%.2f.", subtotal);
    }
}
