package HW_5;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private ContactRepositoy contactRepositoy;

    // Инициализация хранилища
    public ContactService(ContactRepositoy contactRepositoy) {
        this.contactRepositoy = contactRepositoy;
    }
    // Получение контакта по имени
    public Contact getContactByName(String name) {
        return contactRepositoy.getContactByName(name);
    }
    // Получение номера контакта по имени
    public String getTelByName(String name) {
        return  contactRepositoy.getTelByName(name);
    }
    // Получение всех контактов
    public List<Contact> getAllContact() {
        return contactRepositoy.getAllContact();
    }
    // Добавление нового контакта
    public void addContact(Contact contact) {
        contactRepositoy.addContact(contact);
    }
    // Удаление контакта
    public void removeContact(String tel) {
        contactRepositoy.removeContact(tel);
    }
    // Изменение номера телефона у контакта
    public void updateContact(Contact contact, String tel) {
        contactRepositoy.updateContact(contact, tel);
    }
}
