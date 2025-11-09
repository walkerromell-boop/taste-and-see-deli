package com.pluralsight.models;

public class Ingredient implements GetValue{ //make an list for the toppings
private String name;
private String category;
private double price;

    public Ingredient(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public double getValue() {
        return price;
    }

    @Override
    public String toString() {
        return category + ": " + name + " ($" + price + ")";
    }
}
