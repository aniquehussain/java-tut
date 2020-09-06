package com.syedanique;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a number");
        float num1 = scan.nextFloat();
        System.out.println("Enter second number");
        float num2 = scan.nextFloat();
        System.out.println("Enter 0 for add, 1 for subtract,2 for multiply, 3 for divide ");
        int operator = scan.nextInt();

        switch (operator){
            case 0:
                System.out.println(num1 + num2);
            break;
            case 1:
                System.out.println(num1 - num2);
            break;
            case 2:
                System.out.println(num1 * num2);
            break;
            case 3:
                System.out.println(num1 / num2);
            break;

        }


    }
}
