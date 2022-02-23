package com.company;

public class Animal {
   public final String species;// can be specified only once

   private Double weigth = 3.0;
   public String name;
   public final static Double DEFAULT_DOG_WEIGHT = 5.0;
   public final static Double DEFAULT_CAT_WEIGHT = 1.0;
   public final static Double DEFAULT_ELEPHANT_WEIGHT = 2000.0;

   public final static Double DEFAULT_WEIGHT = 0.0;


   public  Animal (String species){
      this.species = species;

      switch (species){
         case "dog" : this.weigth = DEFAULT_DOG_WEIGHT; break;
         case "cat" : this.weigth = DEFAULT_CAT_WEIGHT; break;
         case  "elephant" : this.weigth = DEFAULT_ELEPHANT_WEIGHT; break;
         default:this.weigth = DEFAULT_WEIGHT;

      }
   }


   void printWeight(){
      System.out.println(weigth);
   }

   void feed(Double foodWeight){
      weigth += foodWeight;
      System.out.println("thx for food, bro");
      System.out.println("my weight is now " + weigth);

   }

   String  returnSpeciesAndName(){
      return species + " " + name;
   }


   String returnSpeciesAndOwner(String owner){
      return name + " " + owner;
   }
}
