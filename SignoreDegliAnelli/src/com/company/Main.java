package com.company;

import java.util.ListIterator;

public class Main {
    static Army army1 = new Army();
    static Army army2 = new Army();
    public static void main(String[] args) {
        Warriors warriors = new Warriors("Elf");
        Army army1 = new Army();
        Army army2 = new Army();

        army1.newWarrior("Elf");
        army1.newWarrior("Elf");
        army1.newWarrior("Human");
        army1.newWarrior("Nano");


        army2.newWarrior("Elf");
        army2.newWarrior("Elf");
        army2.newWarrior("Human");
        army2.newWarrior("Nano");
        battle();



        System.out.println("=======================");

        army1.printArray();
        System.out.println("===================");
        army2.printArray();


    }

    public static void battle() {
        int count = 4;
        System.out.println(army1.army.get(1).getPowerAttach());
        while (count > 0) {
            for (int i = 0; i < army2.army.size(); i++) {
                if (army1.army.get(i).getPowerAttach()> army2.army.get(i).getPowerAttach()) {
                    army1.army.remove();
                    System.out.println("dead");
                } else if (army2.army.get(i).getPowerAttach() > army1.army.get(i).getPowerAttach()) {
                    army2.army.remove(i);
                    System.out.println("still alive");

                }
                count--;

            }
        }

    }



}

