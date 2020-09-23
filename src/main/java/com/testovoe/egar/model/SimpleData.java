package com.testovoe.egar.model;

public class SimpleData {
    private String date;
    private int cost;

    public SimpleData(String date, int cost) {
        this.date = date;
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.date + " " + this.cost;
    }
}
