package com.example;

public class Inventory {
    private String[] items;
    public Inventory(int slots){
        this.items = new String[slots];
    }
    public boolean Contains(String item){
        for (String i : this.items){
            if (i == item){
                return true;
            }
        }
        return false;
    }
    public boolean isInventoryFull(){
        for (int i=0; i<items.length; i++){
            if (items[i] == null){
                return false;
            }
        }
        return true;
    }
    public void add(String item){
        for (int i=0; i < items.length; i++){
            if (items[i] == null){
                items[i] = item;
                return;
            }
        }
    }
    public void replaceItem(String newItem, String oldItem){
        for (int i=0; i < items.length; i++){
            if (items[i] == oldItem){
                items[i] = newItem;
                return;
            }
        }
    }
    public String getInventory(){
        String inventory = "";
        for (int i=0; i < items.length; i++){
            inventory = inventory + String.valueOf(i) + " " + items[i] + " ";
        }
        return inventory;
    }
    
}
