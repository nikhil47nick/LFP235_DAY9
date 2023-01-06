package com.bridgelabz.Day9.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Entry {

    ArrayList contact = new ArrayList<Address>();


    public void addEntry(Scanner scr){
        System.out.println("Enter First Name");
        String firstname = scr.next();
        System.out.println("Enter Last Name");
        String lastName = scr.next();
        System.out.println("Enter Address");
        String address = scr.next();
        System.out.println("Enter state");
        String state = scr.next();
        System.out.println("Enter city");
        String city = scr.next();
        System.out.println("Enter zip");
        String zip = scr.next();
        System.out.println("Enter Phone number");
        String phoneNumber = scr.next();
        System.out.println("Enter email");
        String email = scr.next();
        contact.add(new Address( firstname, lastName, address, city, state, zip, phoneNumber, email));
    }

    public void removeEntry(String firstName){

        for (int i=0;i< contact.size();i++) {
            Address e = (Address) contact.get(i);
            if(e.getName().equals(firstName)){
                contact.remove(i);
            }
        }
    }

    public void display(){

        for (int i=0;i< contact.size();i++) {

            Address e = (Address) contact.get(i);
            e.show();
            System.out.println("");

        }
    }



    public static void main(String[] args) {
        Entry new1 = new Entry();
        Scanner scr = new Scanner(System.in);
        new1.addEntry(scr);
        new1.display();
        System.out.println("Enter name to delete");

        String name = scr.next();
        new1.removeEntry(name);
        scr.close();
    }

}
