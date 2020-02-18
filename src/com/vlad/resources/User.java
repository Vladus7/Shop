package com.vlad.resources;

public class User {
    private String name;
    private String address;
    private double balance;
    private double spent;

    public User(String name, String adress, double balance, double spent) {
        this.name = name;
        this.address = adress;
        this.balance = balance;
        this.spent = spent;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public double getSpent() {
        return spent;
    }

    public void Buy(double price){
        balance -= price;
        spent += price;
    }
}
