package com.syedanique;

public class Dealership {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Shaz","salesman");
        Employee emp2 = new Employee("Wali","salesman");
        Employee emp3 = new Employee("Zish","manager");

        Vehicle car1 = new Vehicle("c3","black",4900,"Mercedes");
        Vehicle car2 = new Vehicle("x5","red",2500,"BMW");
        Vehicle car3 = new Vehicle("veyron","blue",10900,"Buggati");
        Vehicle car4 = new Vehicle("veyron","blue",10900,"Buggati");

        Customer anique = new Customer("Anqiue","London",50000);
        Customer asad = new Customer("Asad","USA",1000);
        Customer zaid = new Customer("Zaid","London",2800);
        Customer nawez = new Customer("Nawez","USA",5000);

        // Equals override is helping in this case otherwise we would have got false because it will be checking for
        // location instead of data.

        boolean ans = car3.equals(car4);
        System.out.println(ans);

       //-----------------------------------------------------------------------------------------------------------

        asad.purchaseCar(car3,false,emp1);


    }

}
