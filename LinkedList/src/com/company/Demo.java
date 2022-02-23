package com.company;

import javax.sound.midi.Soundbank;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInOrder(placeToVisit, "Sydney");
        addInOrder(placeToVisit, "Melbourne");
        addInOrder(placeToVisit, "Brisbane");
        addInOrder(placeToVisit, "Perth");
        addInOrder(placeToVisit, "Canberra");
        addInOrder(placeToVisit, "Adelaide");
        addInOrder(placeToVisit, "Darwin");
        printList(placeToVisit);

        addInOrder(placeToVisit, "Alice Springs");
        addInOrder(placeToVisit, "Darwin");
        printList(placeToVisit);
        visit(placeToVisit);





    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator(); // same like for loop
        while (i.hasNext()){ // hasNext checks if there is any other entry
            System.out.println("Now visiting " + i.next()); // i.next is equivalent to write i++
        }
        System.out.println("======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator =  linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
// when comparison returns 0, it means that the value is present in our linked list, in this case we do not want to add anything.
                System.out.println(newCity + " is already included as a destination");
                return false;

            }else if (comparison > 0){
                // new City should appear before this one
                // Brisbane -> Adelaide

                stringListIterator.previous(); //previous can be used just with the listIterator
                stringListIterator.add(newCity);
                return true;
            }

            else if(comparison < 0){
                //move to next city

            }

            }
        stringListIterator.add(newCity);
        return true;
        }

        private static void visit (LinkedList  cities){
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean goingForward = true;

            ListIterator<String> listIterator = cities.listIterator();
            if (cities.isEmpty()){
                System.out.println("No cities in the itinerary");
            } else {
                System.out.println("Now visiting " + listIterator.next());
                printMenu();
            }

            while (!quit){
                int action = scanner.nextInt();
                scanner.nextLine();
                switch (action) {
                    case 0:
                        System.out.println("Holiday (Vacation) over ");
                        quit = true;
                        break;
                    case 1:
                        if (!goingForward){
                            if (listIterator.hasNext()){
                                listIterator.next();
                            }
                            goingForward = true;
                        }
                        if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;

                    }
                        break;
                    case 2:
                        if (goingForward){
                            if (listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            goingForward = false;
                        }
                        if (listIterator.hasPrevious()){
                            System.out.println("Now visiting " + listIterator.previous());
                        }else {
                            System.out.println("we are at the start of the list");
                            goingForward = true;
                        }
                        break;
                    case 3: printMenu();
                    break;
                }
            }
        }





        private static void printMenu(){
        System.out.println("Available action: \npress ");
            System.out.println("0 - to quit\n" + "1 - go to next city\n" + "2 - go to previous city\n" + "3 - print menu options");

    }
    }











