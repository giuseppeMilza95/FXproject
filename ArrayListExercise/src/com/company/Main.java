package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        while (!quit) {

            System.out.println("Choose option: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    mobilePhone.printContact();
                    break;
                case 1:
                    mobilePhone.addContact();
                    break;
                case 2:
                    mobilePhone.updateContact();
                    break;
                case 3:
                    mobilePhone.removeContact();
                    break;
                case 5:
                    mobilePhone.findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }


}
