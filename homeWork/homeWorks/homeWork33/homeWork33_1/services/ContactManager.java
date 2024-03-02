package homeWorks.homeWork33.homeWork33_1.services;

import homeWorks.homeWork33.homeWork33_1.entitys.Contact;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactManager {
    private ArrayList<Contact> contacts=new ArrayList<>();
    public void addContact(Contact contact){
        if(!contacts.contains(contact)){
            contacts.add(contact);
            System.out.println("Contact added.");
        }else{
            System.out.println("Error. The contact is already exist.");
        }
    }
    public void removeContact(Contact contact){
        if(contacts.contains(contact)){
            contacts.remove(contact);
            System.out.println("Contact deleted");
        }else{
            System.out.println("Error. The contact is absent and can`t be removed.");
        }

    }
    public void getContacts(){
        System.out.println("All contacts:");
        for (Contact contact : contacts){
            System.out.println(contact);
            System.out.println("===============================");
        }
    }
    public  void  getContactByName(String name){
        boolean test=false;
        for(Contact contact : contacts){
             if (contact.getName().equals(name)){
                System.out.println(name+" has next phone number:");
                System.out.println(contact.getPhoneNumber());
                System.out.println("===============================");
                test=true;
                break;
            }
        }
        if(!test){
            System.out.println(name+" has no phone number");
        }
    }
    public  void  getContactByPhoneNumber(String phoneNumber){
        boolean test=false;
        for(Contact contact : contacts){
             if (contact.getPhoneNumber().equals(phoneNumber)){System.out.println("The name of number ("+phoneNumber+") owner:");
                System.out.println(contact.getName());
                System.out.println("===============================");
                test=true;
                break;
            }
        }
        if(!test){
            System.out.println(phoneNumber+" is free");
        }
    }

}
