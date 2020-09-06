package com.syedanique.collectionFramework;

public class Vehicle {

    String name;
    int price;
    String model;

    public Vehicle(String name, int price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
