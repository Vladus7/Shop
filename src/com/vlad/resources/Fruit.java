package com.vlad.resources;

public class Fruit extends Products{
    private double shelfLife;

    public double getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(double shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Fruit(String name, double cost, String description, double shelfLife) {
        Name = name;
        Cost = cost;
        Description = description;
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Name:" + Name + "\nCost: " + Cost + "\nDescription: " + Description +  "\nShelfLife: " + shelfLife;
    }

    @Override
    public double callDescription(User user){
        if(user.getSpent()>1000){
            return Cost-(Cost * 0.5);
        }
        else return Cost;
    }

    @Override
    public void printProduct(){
        System.out.println("Фрукт:");
        super.printProduct();
        System.out.println("Срок годности: " + shelfLife);
        System.out.println("---------------------------------------");
    }
}
