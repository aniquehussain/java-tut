package com.syedanique;

import java.util.Scanner;


public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }

    }
}
