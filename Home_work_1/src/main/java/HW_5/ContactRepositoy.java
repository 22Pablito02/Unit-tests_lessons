package HW_5;

import java.util.List;
import java.util.Map;

public interface ContactRepositoy {
    Contact getContactByName(String name);
    String getTelByName(String name);
    List<Contact> getAllContact();
    void addContact(Contact contact);
    void  removeContact(String name);
    void updateContact(Contact contact, String tel);
}
