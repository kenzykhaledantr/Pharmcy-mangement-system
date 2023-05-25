package com.mycompany.loginform;

import java.util.ArrayList;

class Drug {
    private String name;
    private int id;
    private double price;
    private String category;
    private int quantity;
    public  static ArrayList<Drug> userList = new ArrayList<>();

    public Drug(String name, int id, double price, String category, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public Drug() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getters and setters...

    public String toString() {
        return name + "," + id + "," + price + "," + category + "," + quantity;
    }
}