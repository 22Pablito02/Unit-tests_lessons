package HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactRepoInMemory implements  ContactRepositoy{
    private final Map<String, Contact> contacts;

    public ContactRepoInMemory(){
        this.contacts = new HashMap<>();
        Contact contact1 = new Contact("Tom", "Soyer", "89647873322");
        Contact contact2 = new Contact("Jerry", "Mithell", "89647873121");
        Contact contact3 =  new Contact("Alex", "Smit", "89853475869");
        contacts.put("89647873322", contact1);
        contacts.put("89647873121", contact2);
        contacts.put("89853475869", contact3);
    }
    @Override
    public Contact getContactByName(String name) {
        return new Contact("Alex", "Smit", "89853475869");
    }

    @Override
    public String getTelByName(String name) {
        Contact contact = new Contact("Alex", "Smit", "89853475869");
        return contact.getTel();
    }

    @Override
    public List<Contact> getAllContact() {
        return new ArrayList<>(contacts.values());
    }

    @Override
    public void addContact(Contact contact) {
        String key = contact.getTel();
        this.contacts.put(key, contact);
    }

    @Override
    public void removeContact(String tel) {
        this.contacts.remove(tel);
    }

    @Override
    public void updateContact(Contact contact, String tel) {
        contact.setTel(tel);
    }
}
