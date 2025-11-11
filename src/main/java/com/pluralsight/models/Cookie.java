package com.pluralsight.models;

public class Cookie implements GetValue {
    private String cookieName;
    private double cookieQuantity;
    private double cookiePrice;

    public Cookie(String cookieName, double cookieQuantity, double cookiePrice) {
        this.cookieName = cookieName;
        this.cookieQuantity = cookieQuantity;
        this.cookiePrice = cookiePrice;
    }

    public String getCookieName() {
        return cookieName;
    }

    public double getCookieQuantity() {
        return cookieQuantity;
    }

    public double getCookiePrice() {
        return cookiePrice;
    }

    @Override
    public double getValue() {
        return cookiePrice;

    }

    @Override
    public String toString() {
        return "Cookie{" +
                "cookieName='" + cookieName + '\'' +
                ", cookieQuantity=" + cookieQuantity +
                ", cookiePrice=" + cookiePrice +
                '}';
    }
}
