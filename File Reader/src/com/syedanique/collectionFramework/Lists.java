package com.syedanique.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {


//        ArrayList<String> words = new ArrayList<>();
//        words.add("Anique");
//        words.add("Shahan");
//        words.add("Mehvish");
//        words.add("Sadan");
//        System.out.println(words);
//
//        for (String word:words) {
//            System.out.println(word);
//        }
//
//        LinkedList<Integer> numbers = new LinkedList<>();
//        numbers.add(12);
//        numbers.add(66);
//        numbers.add(11);
//        numbers.add(55);
//        System.out.println(numbers);
//        int sum = 0; //Sum of all numbers
//        for (int number:numbers) {
//            sum = sum + number;
//            System.out.println(number);
//
//        }
//
//        System.out.println("Sum of all nos = " + sum);
//        System.out.println("\nJava Version: "+System.getProperty("java.version"));

        ArrayList<Vehicle> cars = new ArrayList<>();
        cars.add(new Vehicle("Mercedes", 30000,"E5"));
        cars.add(new Vehicle("BMW", 20000,"M4"));
        cars.add(new Vehicle("Maserati", 60000,"Z10"));
        cars.add(new Vehicle("Lamborghini", 200000,"Huracan"));

        for (Vehicle car:cars) {
            System.out.println(car);
        }

    }
}
