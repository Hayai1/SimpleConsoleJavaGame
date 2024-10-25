package com.example;

public class Item {
    private String name;
    private Item requirement;
    public Item(String name, Item requirement){
        this.name = name;
        this.requirement = requirement;
    }
    public String getName(){
        return name;
    }
    public Item getItemRequirement(){
        return requirement;
    }
}
