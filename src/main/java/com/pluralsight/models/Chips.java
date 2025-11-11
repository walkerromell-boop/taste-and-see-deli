package com.pluralsight.models;

public class Chips implements GetValue{
    private String chipName;
    private double chipPrice;

    public Chips(String chipName, double chipPrice) {
        this.chipName = chipName;
        this.chipPrice = 1.50;
    }


    public String getChipName() {
        return chipName;
    }

    public double getChipPrice() {
        return chipPrice;
    }

    @Override
    public double getValue() {
        return chipPrice;
    }

    @Override
    public String toString() {
        return "Chips; " +
                "chipName='" + chipName + '\'' +
                ", chipPrice=" + chipPrice +
                '}';
    }
}
