package com.vlad.resources;

import java.io.Serializable;

public abstract class Products implements Serializable {
    protected String Name;
    protected double Cost;
    protected String Description;

//    public Products(String name, double cost, int discount, String description) {
//        this.name = name;
//        this.cost = cost;
//        this.description = description;
//    }

    public String getName() {
        return Name;
    }

    public double getCost() {
        return Cost;
    }

    public double callDescription(User user){
        if(user.getSpent()>1000){
            return Cost-(Cost * 0.1);
        }
        else return Cost;
    }

    @Override
    public String toString() {
        return "Name:" + Name + "\n Cost: " + Cost + "\n  Description: " + Description;
    }

    public void printProduct(){
        System.out.println("Название: " + Name);
        System.out.println("Цена: " + Cost);
        System.out.println("Производитель: " + Description);
    };
//    public abstract void printProduct(Fruit prodct);
//    public abstract void printProduct(Clothes prodct);

}
