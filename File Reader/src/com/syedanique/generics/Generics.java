package com.syedanique.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Generics {
    public static void main(String[] args) {

        Container<Integer,String> mylist = new Container<>(12,"Anique");
        int age = mylist.getItem1();
//        System.out.println(age);
//==================================================================================

//Creating generic methods


        Set<String> mySet1 = new HashSet<>();
        mySet1.add("Anique");
        mySet1.add("Shanab");
        mySet1.add("Shahan");

        Set<String> mySet2 = new HashSet<>();
        mySet1.add("Anique");
        mySet1.add("Shanab");
        mySet1.add("Sadan");

        Set<String> resSet =union(mySet1,mySet2);
//        System.out.println(resSet);

        Iterator<String> itr = resSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
