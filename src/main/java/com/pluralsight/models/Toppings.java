package com.pluralsight.models;

import java.util.List;

public class Toppings implements GetValue{ //make an list for the toppings
private String name;
private double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getValue() {
        return 0;
    }
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
