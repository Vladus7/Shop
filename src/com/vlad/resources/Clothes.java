package com.vlad.resources;

public class Clothes extends Products {
    private String typeOfFabric;

    public String getTypeOfFabric() {
        return typeOfFabric;
    }

    public void setTypeOfFabric(String typeOfFabric) {
        this.typeOfFabric = typeOfFabric;
    }

    public Clothes(String name, double cost, String description, String typeOfFabric) {
        Name = name;
        Cost = cost;
        Description = description;
        this.typeOfFabric = typeOfFabric;
    }

    @Override
    public String toString() {
        return "Name:" + Name + "\nCost: " + Cost + "\nDescription: " + Description +  "\nTypeOfFabric: " + typeOfFabric;
    }

    @Override
    public void printProduct(){
        System.out.println("Одежда:");
        super.printProduct();
        System.out.println("Тип ткани: " + getTypeOfFabric());
        System.out.println("---------------------------------------");
    }
}
