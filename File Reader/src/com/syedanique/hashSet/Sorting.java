package com.syedanique.hashSet;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {

        HashSet<Employee>hashSet = new HashSet<>();
        hashSet.add(new Employee("Anique",900000000,"ceo"));
        hashSet.add(new Employee("Mehv",100000000,"cji"));
        hashSet.add(new Employee("Wali",500000,"manager"));
        hashSet.add(new Employee("Solu",10000,"accountant"));

        //Conversion of hashSet to a list

        List <Employee> mylist = new ArrayList<>(hashSet);


        Collections.sort(mylist);
        System.out.println(mylist);

    }
}
