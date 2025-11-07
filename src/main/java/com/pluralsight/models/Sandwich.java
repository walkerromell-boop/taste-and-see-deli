package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements GetValue {

    private int breadSize;
    private String breadType;
    private List<Sauce> sauces;
    private boolean toasted;

    public Sandwich(int breadSize, String breadType, boolean toasted) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.toasted = toasted;
        this.sauces= new ArrayList<>();
    }

    @Override
    public double getValue() {
        return 0;
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