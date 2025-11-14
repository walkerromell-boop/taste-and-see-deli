package com.pluralsight.models;

import java.util.List;
import java.util.Scanner;

public class CustomSandwich extends Sandwich {
    public CustomSandwich(int breadSize, String breadType, boolean toasted) {
        super(breadSize, breadType,toasted);
        addSignatureIngredients();

    }
    // --- Add predefined signature ingredients ---
    private void addSignatureIngredients() {
        addMeat("Chicken", false);
        addCheese("Provolone", false);
        addTopping(new Ingredient("Lettuce", "Topping", 0, false));
        addTopping(new Ingredient("Tomatoes", "Topping", 0, false));
        addSauce(new Sauce("Mayo"));
    }

    // --- Getters to allow UI to customize ---
    public List<Ingredient> getToppingsList() {
        return super.toppings; // allow modifications
    }

    public List<Ingredient> getMeatsList() {
        return super.meats;
    }

    public List<Ingredient> getCheesesList() {
        return super.cheeses;
    }

    public List<Sauce> getSaucesList() {
        return super.sauces;
    }

    // --- Remove methods ---
    public void removeTopping(String toppingName) {
        getToppingsList().removeIf(t -> t.getIngredientName().equalsIgnoreCase(toppingName));
    }

    public void removeMeat(String meatName) {
        getMeatsList().removeIf(m -> m.getIngredientName().equalsIgnoreCase(meatName));
    }

    public void removeCheese(String cheeseName) {
        getCheesesList().removeIf(c -> c.getIngredientName().equalsIgnoreCase(cheeseName));
    }

    public void removeSauce(String sauceName) {
        getSaucesList().removeIf(s -> s.getSauceName().equalsIgnoreCase(sauceName));
    }
}