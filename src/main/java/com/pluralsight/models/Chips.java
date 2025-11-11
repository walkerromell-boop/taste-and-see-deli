package com.pluralsight.models;

public class Chips implements GetValue{
    private String chipName;
    private double chipPrice;

    public Chips(String chipName, double chipPrice) {
        this.chipName = chipName;
        this.chipPrice = chipPrice;
    }

    public String getChipName() {
        return chipName;
    }

    public double getChipPrice() {
        return chipPrice;
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return "Chips; " +
                "chipName='" + chipName + '\'' +
                ", chipPrice=" + chipPrice +
                '}';
    }
}
