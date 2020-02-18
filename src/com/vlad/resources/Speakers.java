package com.vlad.resources;

public class Speakers extends Products  {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Speakers(String name, double cost, String description, int volume) {
        Name = name;
        Cost = cost;
        Description = description;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Name:" + Name + "\nCost: " + Cost + "\nDescription: " + Description +  "\nVolume: " + volume;
    }

    @Override
    public void printProduct(){
        System.out.println("Наушники:");
        super.printProduct();
        System.out.println("Громкость: " + volume);
        System.out.println("---------------------------------------");
    }
}
