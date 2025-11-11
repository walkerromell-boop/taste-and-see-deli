package com.pluralsight.models;

public class Ingredient implements GetValue{ //make an list for the toppings
private String ingredientName;
private String category;
private double price;

    public Ingredient(String ingredientName, String category, double price) {
        this.ingredientName = ingredientName;
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
        return category + ": " + ingredientName + " ($" + price + ")";
    }
}
