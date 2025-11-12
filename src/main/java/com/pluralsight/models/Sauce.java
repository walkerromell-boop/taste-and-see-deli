package com.pluralsight.models;

public class Sauce {
    private String sauceName;

    public Sauce(String sauceName) {
        this.sauceName = sauceName;
    }

    public String getSauceName() {
        return sauceName;
    }

    @Override
    public String toString() {
        return sauceName;
    }
}
