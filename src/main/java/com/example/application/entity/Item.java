package com.example.application.entity;

public class Item {

    private int id;
    private String name;
    private double quantity;
    private double price;
    private int userId;
    private String companyName;



    public Item() {
    }


    public Item(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Item(String name, double quantity, double price, int userId) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.userId = userId;
    }

    public Item(String name, double quantity, int userId, String companyName) {
        this.name = name;
        this.quantity = quantity;
        this.userId = userId;
        this.companyName = companyName;
    }

    public Item(int id, String name, double quantity, double price, int userId, String companyName) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.userId = userId;
        this.companyName = companyName;
    }

    public Item(int id, String name, double quantity, int userId, String companyName) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Item(String name, double quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
