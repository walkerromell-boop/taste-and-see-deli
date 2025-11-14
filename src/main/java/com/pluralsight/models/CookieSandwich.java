package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class CookieSandwich extends Sandwich implements GetValue{

    public CookieSandwich() {
        super(0, "Cookie", false); // no bread size, not toasted

        addMeat("None", false); // or skip meats entirely
        addCheese("None", false);

        addTopping(new Ingredient("Chocolate Chip Cookie", "Cookie", 0, false));
        addTopping(new Ingredient("Vanilla Frosting", "Filling", 0, false));
    }

    @Override
    public double getValue() {
        return super.getValue();
    }

    @Override
    public String getSummary() {
        return "\n--- Cookie Sandwich ---\n" +
                "Cookies: Chocolate Chip\n" +
                "Filling: Vanilla Frosting\n" +
                "Price: $" + getValue();
    }
}