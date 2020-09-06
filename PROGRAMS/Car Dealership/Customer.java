package com.syedanique;

public class Customer {

    private String name;
    private String address;
    private double cashInHand;

    public double getCashInHand() {
        return cashInHand;
    }

    public void setCashInHand(double cashInHand) {
        this.cashInHand = cashInHand;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String name, String address, int cashInHand) {
        this.name = name;
        this.address = address;
        this.cashInHand = cashInHand;
    }
    public void purchaseCar(Vehicle vehicle,boolean finance,Employee employee){
        employee.handleCustomer(this,finance,vehicle);
    }

}
