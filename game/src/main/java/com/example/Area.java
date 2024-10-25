package com.example;

public class Area {
    private String name;
    private String description;
    private Area[] exits;
    private Item[] items;
    private Character[] characters;

    public Area(String name, String description, Area[] exits){
        this.name = name;
        this.description = description;
        this.exits = exits;
    }
    public Area(String name, String description, Area[] exits, Item[] items){
        this.name = name;
        this.description = description;
        this.exits = exits;
        this.items = items;
    }
    public Area(String name, String description, Area[] exits, Item[] items, Character[] characters){
        this.name = name;
        this.description = description;
        this.exits = exits;
        this.items = items;
        this.characters = characters;
    }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public Area[] getExits() { return exits; } 
    public Item[] getItems() { return items; }
    public Character[] getCharacters() { return characters; }

}
