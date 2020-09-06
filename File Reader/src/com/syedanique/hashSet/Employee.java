package com.syedanique.hashSet;

public class Employee implements Comparable<Employee>{

    String name;
    int salary;
    String dept;

    public Employee(String name, int salary,String dept){
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }


    @Override
    public int compareTo(Employee o) {
        if (this.salary < o.salary){
            return 1;
        }else if (this.salary > o.salary ){
            return  -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
