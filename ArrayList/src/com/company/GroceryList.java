package com.company;

import java.util.ArrayList;

public class GroceryList {
    private int [] myNumber = new int [50];

    private ArrayList<String> groceryList = new ArrayList<String>(); // Array list is a class

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList90 () {
        System.out.println("You have " + groceryList.size() + " items in your grocery list"); // size() how many items in our array list
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i +1) + ". " + groceryList.get(i)); // get the element into our array list
        }
    }

    public void modifyGroceryItem (int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem (int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
}
