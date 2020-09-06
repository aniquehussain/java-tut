package com.syedanique;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            File file = new File("ab1c.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
            e.printStackTrace();
        }

        //Maths is a class that i have defined.
        //Methods that throw exceptions should always be placed in a try catch block.

        Maths sub = new Maths();
        try {
            System.out.println(sub.sub10fromNumber(55));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
