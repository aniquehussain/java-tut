package com.syedanique.hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet$LinkedHashSet {
    public static void main(String[] args) {

// Removes repetitions and don't care for order.
//
//        HashSet<String> names = new HashSet<>();
//        names.add("Anique");
//        names.add("Sadan");
//        names.add("Anique");
//        names.add("Mehv");
//        names.add("Shahan");
//
//        for (String name:names
//             ) {
//            System.out.println(name);
//        }
////Preserves order
//
//        LinkedHashSet<String> newnames = new LinkedHashSet<>();
//        newnames.add("Anique");
//        newnames.add("Sadan");
//        newnames.add("Anique");
//        newnames.add("Mehv");
//        newnames.add("Shahan");
//        for (String name:newnames
//        ) {
//            System.out.println(name);
//        }

// Working with objects

        Animal animal1 = new Animal("lion",15);
        Animal animal2 = new Animal("tiger",12);
        Animal animal3 = new Animal("lion",15);
        Animal animal4 = new Animal("zebra",13);
        Animal animal5 = new Animal("hyena",10);

        LinkedHashSet<Animal> animals = new LinkedHashSet<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        for (Animal animal:animals) {
            System.out.println(animal);
        }
}
}
