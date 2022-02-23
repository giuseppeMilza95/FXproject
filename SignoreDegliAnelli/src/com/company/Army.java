package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Army {
    private Warriors warriors;
    LinkedList<Warriors> army = new LinkedList<Warriors>();
    LinkedList<Warriors> army2 = new LinkedList<Warriors>();


    public void newWarrior2(String warriorName){
        this.army2.add(new Warriors(warriorName));

    }

    public void newWarrior(String warriorName){
        this.army.add(new Warriors(warriorName));

    }
    public void printArray(){
       for (int i = 0; i < army.size(); i ++){
           System.out.println(army.get(i).toString());
       }
       }


    public  void battle() {


        while (army.size() > 0) {
            for (int i = 0; i < army.size(); i++) {
                if (army.get(i).getPowerAttach()> army2.get(i).getPowerAttach()) {
                    army.remove();
                    System.out.println("dead");
                } else if (army2.get(i).getPowerAttach() > army.get(i).getPowerAttach()) {
                    army2.remove(i);
                    System.out.println("still alive");

                }


            }
        }

    }
    }



