package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class GroceryList {
    private int [] myNumbers = new int [50]; //Array
    private ArrayList<String> groceryList = new ArrayList<String>(); // an Array list contains an object, the type has to specify between <>. ArrayList is a class

    public void addGroceryItem (String item){
        groceryList.add(item); // add element on our array list

    }

    public ArrayList<String> getGroceryList() {// we can access to an array list using getter as well
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){ // with array list we use size instead of length
            System.out.println(i+1 + ". " + groceryList.get(i)); // print the element in an array list, we use the method get(i) to print each singular element
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);
        }

    }

    private void modifyGroceryItem (int position, String newItem){
      groceryList.set(position,newItem); // to modify the items we have to use the method set and choose the position and the value that we want to assign.
        System.out.println("Grocery item " + (position + 1 ) + " has been modified."); // we insert position +1 because the computer starts from 0
    }

    public void removeGroceryItem(String item){
      int position = findItem(item);
      if(position >= 0){
          removeGroceryItem(position);
      }
    }
    private void removeGroceryItem(int position){

      groceryList.remove(position); // to remove an item from out grocery list we call the method remove and we pass position as parameters.
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);

    }
    public boolean onFile (String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }
}
