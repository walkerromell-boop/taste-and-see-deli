package com.pluralsight.models;

public class Drink implements GetValue{
private String drinkName;
private String drinkSize;
private double drinkPrice;

    public Drink(String drinkName, String drinkSize, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkSize = drinkSize;
        this.drinkPrice=drinkPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    @Override
    public double getValue() {
        return drinkPrice;
    }


    @Override
    public String toString() {
        return "Drink{" +
                "drinkName='" + drinkName + '\'' +
                ", drinkSize='" + drinkSize + '\'' +
                ", drinkPrice=" + drinkPrice +
                '}';
    }
}
