package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements GetValue {

    private int breadSize;
    private String breadType;
    private List<Sauce> sauces;
    private boolean toasted;
    private List<Ingredient> toppings= new ArrayList<>();

    public Sandwich(int breadSize, String breadType, boolean toasted) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.toasted = toasted;
//        this.sauces= new ArrayList<>();
//        this.toppings = new ArrayList<>();
    }
    public void addTopping(Ingredient ingredient) {
        toppings.add(ingredient);
    }
    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    @Override
    public double getValue() {
        double basePrice;

        switch (breadSize) {
            case 4:
                basePrice = 3.99;
                break;
            case 8:
                basePrice = 5.99;
                break;
            case 12:
                basePrice = 7.99;
                break;
            default:
                basePrice = 0; // unknown size
        }

        for (Ingredient ingredient : toppings) {
            basePrice += ingredient.getValue();
        }

        return basePrice;
    }
}
// store bread type (white, wheat, rye, wrap)
// store sandwich size (4, 8, or 12 inches)
// store if sandwich is toasted
// store meats, cheeses, toppings, sauces
// keep track of total price

// constructor: takes bread type, size, toasted
//   - initialize properties
//   - set base price based on size

// addMeat method:
//   - add meat(s)
//   - what is the price based on size and whether it's extra?

// addCheese method:
//   - add cheese(s)
//   - add price depending on size and whether it's extra

// addTopping method:
//   - add topping(s)
//   - no charge

// addSauce method:
//   - add sauce(s)
//   - no charge

// getPrice method:
//   - return current total price

// getSummary method:
//   - return a string with all sandwich details and price