package homeWorks.homeWork33.homeWork33_1;

import homeWorks.homeWork33.homeWork33_1.entitys.Contact;
import homeWorks.homeWork33.homeWork33_1.services.ContactManager;

public class MainApp {
    public static void main(String[] args) {
        ContactManager manager=new ContactManager();
        manager.addContact(new Contact("Nick","123"));
        manager.addContact(new Contact("Nick","1234"));
        manager.addContact(new Contact("Rosi","123"));
        manager.addContact(new Contact("Rosi","1234"));
        manager.addContact(new Contact("John","12345"));

        manager.getContacts();

        manager.getContactByName("Nick");
        manager.getContactByName("sabina");

        manager.getContactByPhoneNumber("12345");
        manager.getContactByPhoneNumber("51234");

        manager.removeContact(new Contact("Nick","123"));
        manager.getContacts();



    }
}
