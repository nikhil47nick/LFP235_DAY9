package com.bridgelabz.Day9.AddressBook;

public class Address {
    private String firstname;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    Address(String firstname,String lastName,String address,String city,String state,String zip,String phoneNumber,String email){
         this.firstname= firstname;
         this.lastName= lastName;
         this.address= address;
         this.city= city;
         this.state= state;
         this.zip=zip;
         this.phoneNumber=phoneNumber;
         this.email= email;
    }
    Address(){
        firstname= "";
        lastName= "";
        address= "";
        city= "";
        state= "";
        zip="";
        phoneNumber="";
        email= "";
    }

   public void show(){
        System.out.println(" First Name: " +firstname);
        System.out.println(" Last Name: "+lastName);
        System.out.println(" Address: "+address);
        System.out.println(" state: "+state);
        System.out.println(" city: "+city);
        System.out.println(" zip: "+zip);
        System.out.println(" Phone number: "+phoneNumber);
        System.out.println(" email :"+email);
    }

   public String getName(){
        return firstname;
    }

}
