package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static ArrayList<Contact> myContacts;
    private static Scanner scanner = new Scanner(System.in);

    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }


    public void addContact() {
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        if (myContacts.contains(name) || myContacts.contains(phoneNumber)) {
            System.out.println("Contact available on file");
        } else {
            Contact contact = Contact.createContact(name, phoneNumber);
            myContacts.add(contact);
        }
    }


    public void removeContact() {
        System.out.println("Enter contact to be deleted: ");
        String name = scanner.nextLine();
        int findPosition = findContact(name);
        if (findPosition < 0) {
            System.out.println("Contact not found");
        } else {
            myContacts.remove(findPosition);
            System.out.println("Contact deleted");
        }


    }

    public void updateContact() {
        System.out.println("Enter the contact has to be modified: ");
        String name = scanner.nextLine();
        int findPosition = findContact(name);
        if (findPosition < 0) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new phone: ");
            String newNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newName, newNumber);
            this.myContacts.set(findPosition, newContact);

            System.out.println("Successfully updated record");

        }
    }


    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void findContact() {
        System.out.println("Enter a existing name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                System.out.println("Name:" + this.myContacts.get(i).getName() + " Phone:" + this.myContacts.get(i).getTelephoneNumber());

            }
            else   {
                System.out.println("Contact not found");
            }
        }

    }

    public void printContact() {
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println("Name:" + this.myContacts.get(i).getName() + " Phone:" + this.myContacts.get(i).getTelephoneNumber());
        }
    }
}
