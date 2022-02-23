package com.company;

import java.util.Random;

public class Warriors {
private String warrior;
private int strength;
private int ability;
private int powerAttach;
private int sword;
private int arrow;
private int axe;

public int randomFortune (){
    Random random = new Random();
    return random.nextInt(10-1) + 1;
}



    public Warriors(String warrior) {
        this.warrior = warrior;
        this.sword = 6;
        this.arrow = 2;
        this.axe = 1;
        int fortune = randomFortune();
        if (warrior.equals("Human")){
            this.strength = 6;
            this.ability = 5;

            this.powerAttach = strength + ability + sword + fortune;
        }

        else if (warrior.equals("Elf")){
            this.strength = 2;
            this.ability = 9;
            this.powerAttach = strength + ability + arrow + fortune;
        }

        else if (warrior.equals("Nano")){
            this.strength = 9;
            this.ability = 2;
            this.powerAttach = strength + ability + arrow + fortune;
        }
    }

    public String getWarrior() {
        return warrior;
    }

    public int getStrength() {
        return strength;
    }


    public int getPowerAttach() {
        return powerAttach;
    }

    @Override
    public String toString() {
        return getWarrior() +"  " + getPowerAttach();
    }
}
