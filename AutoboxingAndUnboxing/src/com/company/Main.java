package com.company;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	String [] strArray = new String[10];
	int [] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Giuseppe");
        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        //another way is to use the concept og autoboxing
       Integer integer = new Integer(54);
       Double doubleValue = new Double(12.25);
       ArrayList<Integer> intArrayList = new ArrayList<Integer>();
       for (int i = 0; i <= 10; i++){
           intArrayList.add(Integer.valueOf(i)); // autoboxing
       }

        for (int i = 0; i <= 10; i++){
            System.out.println(1 + " --> " + intArrayList.get(i).intValue());
        }
        // ----------- short way unboxing --------------
        Integer myIntValue = 56; // same Integer.valueOf(56);
        int myInt = myIntValue; // same myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl)); // autoboxing we a converting the primitive type dbl to object Double
        }

        for (int i  = 0; i < myDoubleValues.size();i++){
            double value = myDoubleValues.get(i).doubleValue(); // unboxing converting from object to a primitive type
            System.out.println(1 + " --> " + value);

            // the code will run even without autoboxing and unboxing, java will do autoboxing and unboxing automatically
        }

    }
}
