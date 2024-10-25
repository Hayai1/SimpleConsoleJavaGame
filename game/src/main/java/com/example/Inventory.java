package com.example;

public class Inventory {
    private Item[] items;
    public Inventory(int slots){
        this.items = new Item[slots];
    }
    public boolean Contains(Item item){
        for (Item i : this.items){
            if (i.getName() == item.getName()){
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
    public void add(Item item){
        for (int i=0; i < items.length; i++){
            if (items[i] == null){
                items[i] = item;
                return;
            }
        }
    }
    public void replaceItem(Item newItem, Item oldItem){
        for (int i=0; i < items.length; i++){
            if (items[i] != null && items[i].getName() == oldItem.getName()){
                items[i] = newItem;
                return;
            }
        }
    }
    public String getInventory(){
        String inventory = "";
        for (int i=0; i < items.length; i++){
            inventory = inventory + String.valueOf(i) + " " + items[i].getName() + " ";
        }
        return inventory;
    }
    
}
