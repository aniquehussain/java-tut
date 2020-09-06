package com.syedanique.Maps;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sorting {
    public static void main(String[] args) {
        //Do not preserve order
//        HashMap<String, String> animals = new HashMap<>();
//        animals.put("Lion","It is a Cannibal");
//        animals.put("buffalo","Kali Bhais");
//        animals.put("cow","It gives milk");
//        animals.put("Platypus","It is a mammal");
//        animals.put("viper","It is venemous");

//        for (String animal: animals.keySet()) {
//            System.out.println(animal);
//        }

//        for (String animal: animals.values()) {
//            System.out.println(animal);
//        }

//        for (String animal: animals.keySet()) {
//            System.out.println(animals.get(animal));
//        }

//        for (Map.Entry<String, String> entry:animals.entrySet()) {
//            System.out.println(entry.getKey() + " : " +entry.getValue());
//        }
//----------------------------------------------------------------------------------

//        Preserves natural order

//        TreeMap<String, String> animals = new TreeMap<>();
//        animals.put("lion","It is a Cannibal");
//        animals.put("buffalo","Kali Bhais");
//        animals.put("cow","It gives milk");
//        animals.put("platypus","It is a mammal");
//        animals.put("viper","It is venemous");
//
//        for (Map.Entry<String, String> entry:animals.entrySet()) {
//            System.out.println(entry.getKey() + " : " +entry.getValue());
//        }

//-----------------------------------------------------------------------------------


        //Preserves Order of data

        LinkedHashMap<String, String> animals = new LinkedHashMap<>();
        animals.put("lion","It is a Cannibal");
        animals.put("buffalo","Kali Bhais");
        animals.put("cow","It gives milk");
        animals.put("platypus","It is a mammal");
        animals.put("viper","It is venemous");

        for (Map.Entry<String, String> entry:animals.entrySet()) {
            System.out.println(entry.getKey() + " : " +entry.getValue());
        }
    }
}
