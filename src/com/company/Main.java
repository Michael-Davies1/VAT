package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("if you wish to start the program please enter Y");
        String endProgram = input.next();
        while (endProgram == "Y");
        {
            System.out.println("please enter a cash amount");
            double cashAmount = input.nextDouble();
            final double VAT = 0.2;
            double finalAmount = cashAmount + (cashAmount * VAT);
            System.out.println("your amount plus VAT is");
            System.out.println(finalAmount);
            System.out.println("if you wish to end the program press N if you wish to enter a new amount press Y");
            endProgram = input.next();
        }
        

        // write your code here
    }
}
