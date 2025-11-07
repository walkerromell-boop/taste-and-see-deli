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
}
