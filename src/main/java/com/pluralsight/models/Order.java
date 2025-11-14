package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order implements GetValue {

    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    private List<CookieSandwich> cookieSandwiches = new ArrayList<>();

    public Order() {
        sandwiches = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
    }

    public void addCookieSandwich(CookieSandwich cookieSandwich) {
        cookieSandwiches.add(cookieSandwich);
    }

    public List<CookieSandwich> getCookieSandwiches() {
        return cookieSandwiches;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public double getTotal() {
        return getValue();
    }
    public boolean isEmpty() {
        return sandwiches.isEmpty()
                && drinks.isEmpty()
                && chips.isEmpty();
    }


    public void clear() {
        sandwiches.clear();
        drinks.clear();
        chips.clear();
    }

    // --- Add items ---
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    // --- Calculate total using streams ---
    @Override
    public double getValue() {
        double sandwichesTotal = sandwiches.stream()
                .mapToDouble(Sandwich::getValue)
                .sum();

        double drinksTotal = drinks.stream()
                .mapToDouble(Drink::getValue)
                .sum();

        double chipsTotal = chips.stream()
                .mapToDouble(Chips::getValue)
                .sum();

        double cookieTotal = cookieSandwiches.stream()
                .mapToDouble(CookieSandwich::getValue).sum();

        return sandwichesTotal + drinksTotal + chipsTotal + cookieTotal;
    }

    // --- Build summary using streams ---
    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder("----- Order Summary -----\n");

        if (!sandwiches.isEmpty()) {
            summary.append("\nSandwiches:\n");
            sandwiches.stream()
                    .forEach(sandwich -> summary.append(" - ").append(sandwich.getSummary()).append("\n"));
        }

        if (!drinks.isEmpty()) {
            summary.append("\nDrinks:\n");
            drinks.stream()
                    .forEach(drink -> summary.append(" - ").append(drink).append("\n"));
        }

        if (!chips.isEmpty()) {
            summary.append("\nChips:\n");
            chips.stream()
                    .forEach(chips -> summary.append(" - ").append(chips).append("\n"));
        }

        if (!cookieSandwiches.isEmpty()) {
            summary.append("\nCookie Sandwich: \n");
            cookieSandwiches.stream()
                    .forEach(cookieSandwich -> summary.append(" - ").append(cookieSandwich.getSummary()).append("\n"));
        }
//        for (CookieSandwich cookieSandwich : cookieSandwiches) {
//            summary.append(cookieSandwich.getSummary()).append("\n");
//        }

        summary.append("\nTotal: $").append(String.format("%.2f", getValue())).append("\n");
        summary.append("--------------------------");

        return summary.toString();
    }
}

// create List for order items (sandwiches, drinks, and chips)
// store total price

// constructor:
//   - initialize the class propeties

// addSandwich method:
//   - add sandwich to list

// addDrink method:
//   - add drink to list

// addChips method:
//   - add chips to list

// getTotal method:
//   - return total price of order

// getSandwiches, getDrinks, getChips:
//   - return the orders items

// getOrderSummary method:
//   - return formatted string of all items and total