package com.syedanique.generics.understandingGenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Assigning is not working as They are not of same type

        ArrayList<Employee> emp1 = new ArrayList<>();
        emp1.add(new Employee());
        ArrayList<Accountant> ac1 = new ArrayList<>();
        //        emp1 = ac1;

        //Assigning is working as accountant is sub class of Employee

        //Upper Bound

        ArrayList<? extends Employee> emp3 = new ArrayList<>();
        ArrayList<Accountant> ac3 = new ArrayList<>();
        emp3 = ac3;


        //Assigning is working as object is parent class of Employee

        //Lower Bound

        ArrayList<? super Employee> emp2 = new ArrayList<>();
        ArrayList<Object> ac2 = new ArrayList<>();
        emp2 = ac2;

        makeEmployeeWork(emp1);

    }

    public static void makeEmployeeWork(List<Employee> employeeList){
        for (Employee employee:employeeList) {
         employee.work();
        }

    }
}

